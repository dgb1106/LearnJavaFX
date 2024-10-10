module mldp.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens mldp.scenebuilder to javafx.fxml;
    exports mldp.scenebuilder;
}