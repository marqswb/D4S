package ee.mandra.d4s;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button Button1;

    @FXML
    protected void onHelloButtonClick() {
        Button1.setOnMouseClicked(event ->
                {
                    if (event.getButton() == MouseButton.PRIMARY)
                    {
                        welcomeText.setText("LEFT");
                    } else if (event.getButton() == MouseButton.SECONDARY)
                    {
                        welcomeText.setText("RIGHT");
                    }
                }
                );

    }
}