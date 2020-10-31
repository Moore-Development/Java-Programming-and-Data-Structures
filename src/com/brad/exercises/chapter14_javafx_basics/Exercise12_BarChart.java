package com.brad.exercises.chapter14_javafx_basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.chart.BarChart;

public class Exercise12_BarChart extends Application {

    final static String project = "Project";
    final static String quiz = "Quiz";
    final static String midterm = "Midterm";
    final static String finalTest = "Final";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bar Chart");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis, yAxis);
        bc.setTitle("Grades");
        xAxis.setLabel("Grade Type");
        yAxis.setLabel("Percentage");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Unnecessary Use of Series");
        series1.getData().add(new XYChart.Data(project, 20));
        series1.getData().add(new XYChart.Data(quiz, 10));
        series1.getData().add(new XYChart.Data(midterm, 30));
        series1.getData().add(new XYChart.Data(finalTest, 40));

        Scene scene = new Scene(bc, 800,600);
        bc.getData().add(series1);
        stage.setScene(scene);
        stage.show();
    }
}
