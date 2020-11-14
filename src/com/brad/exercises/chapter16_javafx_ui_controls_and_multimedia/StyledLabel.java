package com.brad.exercises.chapter16_javafx_ui_controls_and_multimedia;

import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class StyledLabel extends Label {
    
    public StyledLabel(String text, Node node) {
        super(text, node);
        setTextFill(Color.BLUE);
        setContentDisplay(ContentDisplay.RIGHT);
    }
}
