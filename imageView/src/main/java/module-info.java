module org.mldp.imageview {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mldp.imageview to javafx.fxml;
    exports org.mldp.imageview;
}