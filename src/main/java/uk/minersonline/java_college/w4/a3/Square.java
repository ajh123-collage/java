package uk.minersonline.java_college.w4.a3;

import java.awt.*;

public class Square extends Shape {
    private final double widthOfSide;

    public Square(Color colour, double widthOfSide) {
        super(colour);
        this.widthOfSide = widthOfSide;
    }

    @Override
    public double getArea() {
        return widthOfSide * widthOfSide;
    }

    @Override
    public double getPerimeter() {
        return (widthOfSide + widthOfSide) * 2;
    }

    public double getWidthOfSide() {
        return widthOfSide;
    }
}
