package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise23_AutoResizePolygon extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new MyPolygon(), 600,600);
        primaryStage.setTitle("Auto Resize");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
