module org.mldp.textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mldp.textfield to javafx.fxml;
    exports org.mldp.textfield;
}