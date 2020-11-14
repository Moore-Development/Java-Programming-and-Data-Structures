package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class LinePane extends Pane {

    private Double currentX;
    private Double currentY;    
    
    public LinePane() {
        currentX = 300.0;
        currentY = 300.0;
    }

    public Double getCurrentX() {
        return currentX;
    }

    public Double getCurrentY() {
        return currentY;
    }

    public void newLine(double startX, double startY, double endX, double endY) {

        Line line = new Line(startX, startY, endX, endY);
        line.setStrokeWidth(25);
        line.setStroke(Color.DARKORANGE);
        getChildren().add(line);
    }

    public void lineUp() {

        Line line = new Line(currentX, currentY, currentX, currentY -= 30);
        line.setStrokeWidth(25);
        line.setStroke(Color.DARKORANGE);
        getChildren().add(line);
    }

    public void lineDown() {
        Line line = new Line(currentX, currentY, currentX, currentY += 30);
        line.setStrokeWidth(25);
        line.setStroke(Color.DARKORANGE);
        getChildren().add(line);
    }

    public void lineLeft() {
        Line line = new Line(currentX, currentY, currentX -= 30, currentY);
        line.setStrokeWidth(25);
        line.setStroke(Color.DARKORANGE);
        getChildren().add(line);
    }

    public void lineRight() {
        Line line = new Line(currentX, currentY, currentX += 30, currentY);
        line.setStrokeWidth(25);
        line.setStroke(Color.DARKORANGE);
        getChildren().add(line);
    }
}
