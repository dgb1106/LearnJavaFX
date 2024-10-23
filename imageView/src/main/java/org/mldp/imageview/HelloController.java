package org.mldp.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    ImageView loginSite;
    @FXML
    Button changeButton;

    Image myImage = new Image(getClass().getResourceAsStream("assets/sampleDesign/2.png"));

    public void displayImage() {
        loginSite.setImage(myImage);
    }
}