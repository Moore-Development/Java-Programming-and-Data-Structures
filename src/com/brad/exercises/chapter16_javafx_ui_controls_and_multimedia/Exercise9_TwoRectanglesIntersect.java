package com.brad.exercises.chapter16_javafx_ui_controls_and_multimedia;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class Exercise9_TwoRectanglesIntersect extends Application{

    private boolean intersect;

    private Label rectangleLabel;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        StringConverter<Number> converter = new NumberStringConverter();
        
        // rectanglePane section

        OverlappableRectangle rectangle1 = new OverlappableRectangle(100, 100, 50, 50);
        rectangle1.setStroke(Color.BLUE);
        //rectangle1.setStrokeWidth(5);
        
        OverlappableRectangle rectangle2 = new OverlappableRectangle(300, 100, 50, 50);
        rectangle2.setStroke(Color.BLUE);
        //rectangle2.setStrokeWidth(5);

        rectangle1.setOnMouseDragged(e -> {
            rectangle1.setX(e.getX());
            rectangle1.setY(e.getY());
            intersect = rectangle1.overlaps(rectangle2) ?  true : false;
            if (intersect) {
                rectangleLabel.setText("Two Rectangles Intersect? Yes");
            }
            else {
                rectangleLabel.setText("Two Rectangles Intersect? No");
            }
        });

        rectangle2.setOnMouseDragged(e -> {
            rectangle2.setX(e.getX());
            rectangle2.setY(e.getY());
            intersect = rectangle1.overlaps(rectangle2) ?  true : false;
            if (intersect) {
                rectangleLabel.setText("Two Rectangles Intersect? Yes");
            }
            else {
                rectangleLabel.setText("Two Rectangles Intersect? No");
            }
        });

        Pane rectanglePane = new Pane(); 
        rectanglePane.getChildren().addAll(rectangle1, rectangle2);
        rectanglePane.setPrefSize(417, 250);
        rectanglePane.setStyle("-fx-border-color: blue;");

        intersect = rectangle1.overlaps(rectangle2) ?  true : false;
        if (intersect) {
            rectangleLabel = 
                new Label(String.format("Two Rectangles Intersect? Yes"));
        }
        else {
            rectangleLabel = 
                new Label(String.format("Two Rectangles Intersect? No"));
        }
    
        rectangleLabel.setTextFill(Color.BLUE);
        rectangleLabel.setStyle("-fx-font-size: 20px;");
        rectangleLabel.setPadding(new Insets(0,0,15,0));

        BorderPane topPane = new BorderPane();
        topPane.setTop(rectangleLabel);
        topPane.setCenter(rectanglePane);
        BorderPane.setAlignment(rectangleLabel, Pos.CENTER);
        topPane.setPadding(new Insets(0,0,15,0));

        // Left VBox section

        StyledTextField tfRectangle1X = new StyledTextField();
        // For the below binding to work, a NumberStringConverter must be implemented
        // to convert a string property before it is bound to a double property
        Bindings.bindBidirectional(tfRectangle1X.textProperty(), rectangle1.xProperty(), converter);
        StyledLabel lblRectangle1X = new StyledLabel("X:", tfRectangle1X);

        StyledTextField tfRectangle1Y = new StyledTextField();
        Bindings.bindBidirectional(tfRectangle1Y.textProperty(), rectangle1.yProperty(), converter);
        StyledLabel lblRectangle1Y = new StyledLabel("Y:", tfRectangle1Y);

        StyledTextField tfRectangle1Width = new StyledTextField();
        tfRectangle1Width.setText(Double.toString(rectangle1.getWidth()));
        StyledLabel lblRectangle1Width = new StyledLabel("Width:", tfRectangle1Width);

        StyledTextField tfRectangle1Height = new StyledTextField();
        tfRectangle1Height.setText(Double.toString(rectangle1.getHeight()));
        StyledLabel lblRectangle1Height = new StyledLabel("Height:", tfRectangle1Height);

        VBox leftVBox = new VBox(10);
        leftVBox.getChildren().addAll(
            lblRectangle1X, lblRectangle1Y, lblRectangle1Width, lblRectangle1Height);
        leftVBox.setStyle("-fx-font-size: 16px;");
        leftVBox.setAlignment(Pos.CENTER_RIGHT);

        Label lblLeftVBox = new Label("Enter Rectangle 1 Info:", leftVBox);
        lblLeftVBox.setContentDisplay(ContentDisplay.BOTTOM);
        lblLeftVBox.setTextFill(Color.BLUE);
        lblLeftVBox.setStyle("-fx-font-size: 18px; -fx-border-color: blue;");
        lblLeftVBox.setPadding(new Insets(10,10,10,10));

        // Right VBox section

        StyledTextField tfRectangle2X = new StyledTextField();
        Bindings.bindBidirectional(tfRectangle2X.textProperty(), rectangle2.xProperty(), converter);
        StyledLabel lblRectangle2X = new StyledLabel("X:", tfRectangle2X);

        StyledTextField tfRectangle2Y = new StyledTextField();
        Bindings.bindBidirectional(tfRectangle2Y.textProperty(), rectangle2.yProperty(), converter);
        StyledLabel lblRectangle2Y = new StyledLabel("Y:", tfRectangle2Y);

        StyledTextField tfRectangle2Width = new StyledTextField();
        tfRectangle2Width.setText(Double.toString(rectangle2.getWidth()));
        StyledLabel lblRectangle2Width = new StyledLabel("Width:", tfRectangle2Width);
        
        StyledTextField tfRectangle2Height = new StyledTextField();
        tfRectangle2Height.setText(Double.toString(rectangle2.getHeight()));
        StyledLabel lblRectangle2Height = new StyledLabel("Height:", tfRectangle2Height);

        VBox rightVBox = new VBox(10);
        rightVBox.getChildren().addAll(
            lblRectangle2X, lblRectangle2Y, lblRectangle2Width, lblRectangle2Height);
        rightVBox.setStyle("-fx-font-size: 16px;");
        rightVBox.setAlignment(Pos.CENTER_RIGHT);

        Label lblRightVBox = new Label("Enter Rectangle 2 Info:", rightVBox);
        lblRightVBox.setContentDisplay(ContentDisplay.BOTTOM);
        lblRightVBox.setTextFill(Color.BLUE);
        lblRightVBox.setStyle("-fx-font-size: 18px; -fx-border-color: blue;");
        lblRightVBox.setPadding(new Insets(10,10,10,10));

        // HBox section

        HBox centerHbox = new HBox(15, lblLeftVBox, lblRightVBox);

        // button section

        Button redrawButton = new Button("Click to Redraw Rectangles");
        redrawButton.setStyle("-fx-background-color: black; -fx-text-fill: blue; -fx-border-color: blue; -fx-font-size: 18");
        redrawButton.setOnAction(e -> {
            rectangle1.setX(Double.parseDouble(tfRectangle1X.getText()));
            rectangle1.setY(Double.parseDouble(tfRectangle1Y.getText()));
            rectangle1.setWidth(Double.parseDouble(tfRectangle1Width.getText()));
            rectangle1.setHeight(Double.parseDouble(tfRectangle1Height.getText()));
            rectangle2.setX(Double.parseDouble(tfRectangle2X.getText()));
            rectangle2.setY(Double.parseDouble(tfRectangle2Y.getText()));
            rectangle2.setWidth(Double.parseDouble(tfRectangle2Width.getText()));
            rectangle2.setHeight(Double.parseDouble(tfRectangle2Height.getText()));
            intersect = rectangle1.overlaps(rectangle2) ?  true : false;
            if (intersect) {
                rectangleLabel.setText("Two Rectangles Intersect?: Yes");
            }
            else {
                rectangleLabel.setText("Two Rectangles Intersect?: No");
            }
        });

        // BorderPane section

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: black;");
        borderPane.setTop(topPane);
        borderPane.setCenter(centerHbox);
        borderPane.setBottom(redrawButton);
        borderPane.setPadding(new Insets(5,15,15,15));
        BorderPane.setMargin(redrawButton, new Insets(15,0,0,0));
        BorderPane.setAlignment(redrawButton, Pos.CENTER);

        // Scene section

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Exercise16_09");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
