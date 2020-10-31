package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import com.brad.helper.style.OrangeButton;

public class Exercise3_MoveTheBall extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // circle pane
        Pane circlePane = new Pane();
        Circle circle = new Circle(35);
        circlePane.getChildren().add(circle);
        circle.setFill(Color.DARKORANGE);
        circle.setCenterX(250);
        circle.setCenterY(250);

        // button pane
        Button btnUp = new OrangeButton("Up");
        Button btnDown = new OrangeButton("Down");
        Button btnLeft = new OrangeButton("Left");
        Button btnRight = new OrangeButton("Right");
        HBox hBox = new HBox(btnUp, btnDown, btnLeft, btnRight);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        // anonymous inner classes for event handling
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterY(circle.getCenterY() > 50 ? circle.getCenterY() - 25 : 50);
            }
        });

        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterY(circle.getCenterY() < 425 ? circle.getCenterY() + 25 : 425);
            }
        });

        btnLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterX(circle.getCenterX() > 50 ? circle.getCenterX() - 25 : 50);
            }
        });

        btnRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                circle.setCenterX(circle.getCenterX() < 450 ? circle.getCenterX() + 25 : 450);
            }
        });
        
        // parent borderpane
        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        borderPane.setCenter(circlePane);
        borderPane.setBackground(new Background(
                new BackgroundFill(Color.BLACK,null,null)));
        
        // scene
        Scene scene = new Scene(borderPane, 500,500);
        
        // stage
        primaryStage.setTitle("Move the Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
