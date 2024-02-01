package uk.minersonline.java_college.w3.activity2;

import java.awt.*;

public class Mammal {
    protected final String name;
    private int age;
    private final Color furColour;
    private String favouriteFood;

    public Mammal(String name, int age, Color furColour, String favouriteFood) {
        this.name = name;
        this.age = age;
        this.furColour = furColour;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Color getFurColour() {
        return furColour;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void jump() {
        System.out.println(this.name + " has jumped");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }
}
