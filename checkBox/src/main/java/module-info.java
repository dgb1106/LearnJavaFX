module org.mldp.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mldp.checkbox to javafx.fxml;
    exports org.mldp.checkbox;
}