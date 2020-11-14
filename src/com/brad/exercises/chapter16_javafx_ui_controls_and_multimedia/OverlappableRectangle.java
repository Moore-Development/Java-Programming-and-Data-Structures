package com.brad.exercises.chapter16_javafx_ui_controls_and_multimedia;

import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;

public class OverlappableRectangle extends Rectangle{
    
    public OverlappableRectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public boolean overlaps(OverlappableRectangle otherRectangle) {

        Rectangle2D rectangle1 = new Rectangle2D(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        Rectangle2D rectangle2 = new Rectangle2D(otherRectangle.getX(), otherRectangle.getY(), otherRectangle.getWidth(), otherRectangle.getHeight());
        if (rectangle1.intersects(rectangle2) || rectangle2.intersects(rectangle1)) {
            return true;
        }
        return false;
    }
}
