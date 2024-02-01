package uk.minersonline.java_college.w3.activity8;

import java.awt.*;

public class Cat extends Mammal {
    private int remainingLives;

    public Cat(String name, int age, Color furColour, String favouriteFood, int remainingLives) {
        super(name, age, furColour, favouriteFood);
        this.remainingLives = remainingLives;
    }

    public void meow() {
        System.out.println(this.name + " has meowed");
    }

    public int getRemainingLives() {
        return remainingLives;
    }

    public void setRemainingLives(int remainingLives) {
        this.remainingLives = remainingLives;
    }
}
