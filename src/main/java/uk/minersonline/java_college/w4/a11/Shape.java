package uk.minersonline.java_college.w4.a11;

import java.awt.*;

public abstract class Shape {
    private final Color colour;

    public Shape(Color colour) {
        this.colour = colour;
    }

    public Color getColour() {
        return colour;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
