module org.mldp.logout {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mldp.logout to javafx.fxml;
    exports org.mldp.logout;
}