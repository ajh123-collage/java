package uk.minersonline.java_college.w4.a11;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class w4a11Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(Color.BLUE, 10));
        shapes.add(new Rectangle(Color.GREEN, 10, 10));
        shapes.add(new Square(Color.RED, 10));

//        for (Shape shape : shapes)
    }
}
