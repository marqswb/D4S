package ee.mandra.d4s;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        final int sceneHeight = 500;
        final int sceneWidth = 500;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), sceneHeight, sceneWidth);
        stage.setMaxHeight(sceneHeight);
        stage.setMaxWidth(sceneWidth);
        stage.setTitle("D4S");
        stage.setScene(scene);
        stage.show();






    }

    public static void main(String[] args) {
        launch();
    }
}