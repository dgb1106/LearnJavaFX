module org.mldp.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mldp.radiobutton to javafx.fxml;
    exports org.mldp.radiobutton;
}