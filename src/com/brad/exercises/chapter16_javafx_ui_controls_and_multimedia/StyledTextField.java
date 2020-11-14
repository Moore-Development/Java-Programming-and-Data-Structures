package com.brad.exercises.chapter16_javafx_ui_controls_and_multimedia;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class StyledTextField extends TextField{
    
    public StyledTextField() {
        super();
        setStyle("-fx-text-fill: blue");
        setAlignment(Pos.CENTER_RIGHT);
        setPrefWidth(65);
    }
}
