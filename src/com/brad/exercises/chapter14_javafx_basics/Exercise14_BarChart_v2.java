package com.brad.exercises.chapter14_javafx_basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Exercise14_BarChart_v2 extends Application {

    final static String project = "Project";
    final static String quiz = "Quiz";
    final static String midterm = "Midterm";
    final static String finalTest = "Final";

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bar Chart");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis, yAxis);
        bc.setTitle("Grades");
        xAxis.setLabel("Grade Type");
        yAxis.setLabel("Percentage");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Project");
        series1.getData().add(new XYChart.Data(project, 20));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Quiz");
        series2.getData().add(new XYChart.Data(quiz, 10));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Midterm");
        series3.getData().add(new XYChart.Data(midterm, 30));

        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Final");
        series4.getData().add(new XYChart.Data(finalTest, 40));

        Scene scene = new Scene(bc, 800,600);
        bc.getData().addAll(series1, series2, series3, series4);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
