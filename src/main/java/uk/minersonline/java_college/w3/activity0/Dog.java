package uk.minersonline.java_college.w3.activity0;

import java.awt.*;

public class Dog {
    private final String name;
    private int age;
    private final Color furColour;
    private String favouriteFood;
    private String favouritePark;

    public Dog(String name, int age, Color furColour, String favouriteFood, String favouritePark) {
        this.name = name;
        this.age = age;
        this.furColour = furColour;
        this.favouriteFood = favouriteFood;
        this.favouritePark = favouritePark;
    }

    public void jump() {
        System.out.println(this.name + " has jumped");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void bark() {
        System.out.println(this.name + " has barked");
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

    public String getFavouritePark() {
        return favouritePark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setFavouritePark(String favouritePark) {
        this.favouritePark = favouritePark;
    }
}
