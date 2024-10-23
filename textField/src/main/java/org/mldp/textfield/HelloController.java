package org.mldp.textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    int age;

    public void submit(ActionEvent event) {
        try {
            age = Integer.parseInt(myTextField.getText());
            System.out.println(age);
            if (age >= 18) {
                myLabel.setText("You are now signed up!");
            } else {
                myLabel.setText("You must be at least 18 years old");
            }
        } catch(NumberFormatException e) {
            myLabel.setText("Enter only number please!");
        }
        catch (Exception e) {
            myLabel.setText("error");
        }
    }
}