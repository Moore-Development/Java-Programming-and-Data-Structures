package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise11_MoveACircleUsingKeys extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // circle
        Circle circle = new Circle(35);
        circle.setFill(Color.DARKORANGE);
        circle.setCenterX(250);
        circle.setCenterY(250);

        // circle pane
        Pane circlePane = new Pane();
        circlePane.getChildren().add(circle);
        circlePane.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
        circle.setFill(Color.DARKORANGE);
        circle.setCenterX(250);
        circle.setCenterY(250);

        // scene
        Scene scene = new Scene(circlePane, 500,500);

        // lambda functions for key press event handling
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP: circle.setCenterY(circle.getCenterY() > 50 ? circle.getCenterY() - 25 : 50); break;
                case DOWN: circle.setCenterY(circle.getCenterY() < 450 ? circle.getCenterY() + 25 : 450); break;
                case LEFT: circle.setCenterX(circle.getCenterX() > 50 ? circle.getCenterX() - 25 : 50); break;
                case RIGHT: circle.setCenterX(circle.getCenterX() < 450 ? circle.getCenterX() + 25 : 450); break;
                default: break;
            }
        });
        
        // stage
        primaryStage.setTitle("Move the Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
