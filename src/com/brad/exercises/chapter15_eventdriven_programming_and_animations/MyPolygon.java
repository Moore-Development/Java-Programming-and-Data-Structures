package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.collections.ObservableList;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class MyPolygon extends Pane{
    
    public MyPolygon() {

        setBackground(new Background(
                new BackgroundFill(Color.BLACK,null,null)));
    }

    private void paint() {

        Polygon polygon = new Polygon();
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.WHITE);
        polygon.setStrokeWidth(20);

        ObservableList<Double> list = polygon.getPoints();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;

        for(int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
        }

        getChildren().clear();
        getChildren().add(polygon);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}
