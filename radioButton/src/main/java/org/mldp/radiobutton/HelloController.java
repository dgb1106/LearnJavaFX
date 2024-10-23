package org.mldp.radiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private RadioButton button1, button2, button3;

    public void getFood(ActionEvent event) {
        if (button1.isSelected()) {
            myLabel.setText("pizza, i choose you");
        } else if (button2.isSelected()) {
            myLabel.setText("sushi would be nice");
        } else if (button3.isSelected()) {
            myLabel.setText("Oh, let's go for a bowl of ramen");
        }
    }
}