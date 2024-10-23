package org.mldp.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    ImageView myImageView;

    Image myImage1 = new Image(getClass().getResourceAsStream("assets/logos/mldpLogo(500x500).png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("assets/dashboard/bell.png"));

    public void change(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            myImageView.setImage(myImage2);
            myLabel.setText("DING DONG!");
        } else {
            myImageView.setImage(myImage1);
            myLabel.setText("LOGO IS HERE!");
        }
    }
}