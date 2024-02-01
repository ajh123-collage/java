package uk.minersonline.java_college.w3.activity10;

import java.awt.*;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(Color colour, double width, double height) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
