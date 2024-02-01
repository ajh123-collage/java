package uk.minersonline.java_college.w3.activity1;

import java.awt.*;

public class Dog extends Mammal {
    private String favouritePark;

    public Dog(String name, int age, Color furColour, String favouriteFood, String favouritePark) {
        super(name, age, furColour, favouriteFood);
        this.favouritePark = favouritePark;
    }

    public void bark() {
        System.out.println(this.getName() + " has barked");
    }

    public String getFavouritePark() {
        return favouritePark;
    }

    public void setFavouritePark(String favouritePark) {
        this.favouritePark = favouritePark;
    }
}
