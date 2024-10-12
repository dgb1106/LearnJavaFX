module mldp.css_styling {
    requires javafx.controls;
    requires javafx.fxml;


    opens mldp.css_styling to javafx.fxml;
    exports mldp.css_styling;
}