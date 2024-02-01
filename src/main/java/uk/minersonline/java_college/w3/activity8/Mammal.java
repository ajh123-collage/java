package uk.minersonline.java_college.w3.activity8;

import java.awt.*;

public abstract class Mammal extends Animal {
    protected final Color furColour;
    public Mammal(String name, int age, Color furColour, String favouriteFood) {
        super(name, age, favouriteFood);
        this.furColour = furColour;
    }

    public Color getFurColour() {
        return furColour;
    }

    public void jump() {
        System.out.println(this.name + " has jumped");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }
}
