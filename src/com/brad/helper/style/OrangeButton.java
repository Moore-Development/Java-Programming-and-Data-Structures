package com.brad.helper.style;

import javafx.scene.control.Button;

// fancy orange buttons
public class OrangeButton extends Button {

    public OrangeButton(String label) {
        super(label);
        super.setStyle("-fx-background-color: darkorange;");
    }
}