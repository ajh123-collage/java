package uk.minersonline.java_college.w3.activity10;

import java.awt.*;

public class Circle extends Shape {
    final double radius;

    public Circle(Color colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
