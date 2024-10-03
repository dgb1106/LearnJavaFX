module org.example.learnjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.learnjavafx to javafx.fxml;
    exports org.example.learnjavafx;
}