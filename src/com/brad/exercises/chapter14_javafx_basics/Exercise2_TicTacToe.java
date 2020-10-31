package com.brad.exercises.chapter14_javafx_basics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.util.Random;

public class Exercise2_TicTacToe extends Application{

    Random rand = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(10,10,10,10));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Image image = randomImage();
                pane.add(new ImageView(image), i, j);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Image randomImage() {
        int randomNum = rand.nextInt(3);
        if (randomNum == 1) {
            return new Image("file:image/o.gif");
        }
        else if (randomNum == 2) {
            return new Image("file:image/x.gif");
        }
        else {
            return null;
        }
    }
}
