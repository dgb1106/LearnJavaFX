package org.example.learnjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.shape.Line;

//import javax.sound.sampled.Line;
import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Stage stage = new Stage();
//        Group root = new Group();
//        Scene scene = new Scene(root, Color.BLACK);
//
//        Image icon = new Image(getClass().getResourceAsStream("/icon.jpg"));
//        stage.getIcons().add(icon);
//        stage.setTitle("Stage Demo Program");
//        stage.setWidth(800);
//        stage.setHeight(600);
//        stage.setResizable(false);
//        stage.setX(50);
//       stage.setY(50);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press Q");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
//
//        stage.setScene(scene);
//        stage.show();

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Hello World!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }
}