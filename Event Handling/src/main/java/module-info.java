module mldp.event_handling {
    requires javafx.controls;
    requires javafx.fxml;

    opens mldp.event_handling to javafx.fxml;
    exports mldp.event_handling;
}