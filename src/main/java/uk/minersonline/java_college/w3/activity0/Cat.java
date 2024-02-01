package uk.minersonline.java_college.w3.activity0;

import java.awt.*;

public class Cat {
    private final String name;
    private int age;
    private final Color furColour;
    private String favouriteFood;
    private int remainingLives;

    public Cat(String name, int age, Color furColour, String favouriteFood, int remainingLives) {
        this.name = name;
        this.age = age;
        this.furColour = furColour;
        this.favouriteFood = favouriteFood;
        this.remainingLives = remainingLives;
    }

    public void jump() {
        System.out.println(this.name + " has jumped");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void meow() {
        System.out.println(this.name + " has meowed");
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

    public int getRemainingLives() {
        return remainingLives;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setRemainingLives(int remainingLives) {
        this.remainingLives = remainingLives;
    }
}
