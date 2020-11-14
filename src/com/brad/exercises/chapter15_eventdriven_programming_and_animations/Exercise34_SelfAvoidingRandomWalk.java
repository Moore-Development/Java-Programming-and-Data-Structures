package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import java.util.ArrayList;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise34_SelfAvoidingRandomWalk extends Application {

    final String UP = "Up";
    final String DOWN = "Down";
    final String LEFT = "Left";
    final String RIGHT = "Right";

    Random rand = new Random();
    LinePane linePane = new LinePane();
    ArrayList<Point> visited = new ArrayList<Point>();
    Point currentPoint = new Point(300, 300, "");
    boolean cont = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        linePane.setBackground(new Background(
                new BackgroundFill(Color.BLACK,null,null)));

        visited.add(currentPoint);

        EventHandler<ActionEvent> eventHandler = e -> {
            
            if(cont == true) {

                Point futurePoint = findValidMove(currentPoint);
                if (futurePoint != null) {
                    createLine(currentPoint, futurePoint);
                    currentPoint = futurePoint;
                    visited.add(currentPoint);
                }
                else {
                    cont = false;
                }
            }
        };

        Timeline animation = new Timeline(
            new KeyFrame(Duration.millis(75), eventHandler));

        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        System.out.print("List of points visited:");
        System.out.println(visited);

        Scene scene = new Scene(linePane, 800, 600);
        primaryStage.setTitle("Draw Lines");
        primaryStage.setScene(scene);
        primaryStage.show();

        linePane.requestFocus();
    }

    private String randomDirection() {

        int randomDirection = rand.nextInt(4);
        switch (randomDirection) {
            case 0: return UP;
            case 1: return DOWN;
            case 2: return LEFT;
            case 3: return RIGHT;
            default: return "Error";
        }
    }

    private Point createPoint(Point point, String direction) {

        switch (direction) {
            case UP: 
                return new Point(point.getX(), point.getY() - 30, direction);
            case DOWN:
                return new Point(point.getX(), point.getY() + 30, direction);
            case LEFT:
                return new Point(point.getX() - 30, point.getY(), direction);
            case RIGHT:
                return new Point(point.getX() + 30, point.getY(), direction);
            default: return point;
        }
    }

    private Point findValidMove(Point point) {
        
       boolean attemptedUp = false;
       boolean attemptedDown = false;
       boolean attemptedLeft = false;
       boolean attemptedRight = false;

        while(!attemptedUp || !attemptedDown || !attemptedLeft || !attemptedRight) {

            String currentDirection = randomDirection();
            switch (currentDirection) {
                case UP: attemptedUp = true; break;
                case DOWN: attemptedDown = true; break;
                case LEFT: attemptedLeft = true; break;
                case RIGHT: attemptedRight = true; break;
                default: break;
            }
            Point possibleFuturePoint = createPoint(point, currentDirection);

            if(isValidPoint(possibleFuturePoint)) {

                return possibleFuturePoint;
            }
        }
        System.out.println("Returning 'null', execution should stop here.");
        return null;
    }

    private boolean isValidPoint(Point point) {

        for(Point item : visited) {

            if (point.getX() == item.getX()
                &&  point.getY() == item.getY()) {
            
                System.out.printf("Point %s has been previously visited\n", point.toString());
                return false;
            }

            else if (point.getX() <= 0 || point.getX() >= 800 
                || point.getY() <= 0 || point.getY() >= 600) {
                System.out.printf("Point %s is out of bounds\n", point.toString());
                return false;
            }
        }
        return true;
    }

    private void createLine(Point startPoint, Point endPoint) {
        linePane.newLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
    }
}