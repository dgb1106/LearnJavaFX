module org.example.learnjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.learnjavafx to javafx.fxml;
    exports org.example.learnjavafx;
}