module mldp.switch_scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens mldp.switch_scenes to javafx.fxml;
    exports mldp.switch_scenes;
}