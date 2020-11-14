package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise9_DrawLines extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        LinePane linePane = new LinePane();
        linePane.setBackground(new Background(
                new BackgroundFill(Color.BLACK,null,null)));

        linePane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP: linePane.lineUp(); break;
                case DOWN: linePane.lineDown(); break;
                case LEFT: linePane.lineLeft(); break;
                case RIGHT: linePane.lineRight(); break;
                default: break;
            }
        });

        Scene scene = new Scene(linePane, 600,600);
        primaryStage.setTitle("Draw Lines");
        primaryStage.setScene(scene);
        primaryStage.show();

        linePane.requestFocus();
    }
}