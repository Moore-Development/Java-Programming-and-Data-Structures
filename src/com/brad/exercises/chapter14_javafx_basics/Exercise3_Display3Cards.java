package com.brad.exercises.chapter14_javafx_basics;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

import static java.util.Collections.shuffle;

public class Exercise3_Display3Cards extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ArrayList <Integer> deck = new ArrayList <>();
        for(int i = 1; i < 53; i++) {
            deck.add(i);
        }
        shuffle(deck);

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(10,10,10,10));
        Image card1 = new Image(String.format("file:image/card/%d.png",deck.get(0)));
        Image card2 = new Image(String.format("file:image/card/%d.png",deck.get(1)));
        Image card3 = new Image(String.format("file:image/card/%d.png",deck.get(2)));

        pane.getChildren().addAll(new ImageView(card1), new ImageView(card2), new ImageView(card3));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Three Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
