package com.brad.exercises.chapter15_eventdriven_programming_and_animations;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import static java.util.Collections.shuffle;

public class Exercise1_PickFourCards extends Application {

    CardPane hand = new CardPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button refresh = new Button("New Hand");
        RefreshHandlerClass handler = new RefreshHandlerClass();
        refresh.setOnAction(handler);

        BorderPane pane = new BorderPane();
        pane.setCenter(hand);
        pane.setBottom(refresh);
        BorderPane.setAlignment(refresh, Pos.CENTER);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Three Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class RefreshHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            hand.refresh();
        }
    }
}

class CardPane extends Pane {

    ArrayList<Integer> deck = new ArrayList<>();

    public CardPane() {
        for (int i = 1; i < 53; i++) {
            deck.add(i);
        }
        createHand();
    }

    public void refresh() {
        getChildren().removeAll();
        createHand();
    }

    public void createHand() {
        shuffle(deck);
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        Image card1 = new Image(String.format("file:image/card/%d.png",deck.get(0)));
        Image card2 = new Image(String.format("file:image/card/%d.png",deck.get(1)));
        Image card3 = new Image(String.format("file:image/card/%d.png",deck.get(2)));
        Image card4 = new Image(String.format("file:image/card/%d.png",deck.get(3)));
        hBox.getChildren().addAll
                (new ImageView(card1), new ImageView(card2), new ImageView(card3), new ImageView(card4));
        getChildren().add(hBox);
    }
}
