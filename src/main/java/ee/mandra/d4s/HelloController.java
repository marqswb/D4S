package ee.mandra.d4s;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView Shout;

    @FXML
    protected void onMouseButtonClick() {


        Shout.setOnMouseClicked(event ->
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