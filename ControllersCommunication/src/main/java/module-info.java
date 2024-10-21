module mldp.controllerscommunication {
    requires javafx.controls;
    requires javafx.fxml;


    opens mldp.controllerscommunication to javafx.fxml;
    exports mldp.controllerscommunication;
}