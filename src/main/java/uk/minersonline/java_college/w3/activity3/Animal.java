package uk.minersonline.java_college.w3.activity3;

public class Animal {
    protected final String name;
    protected int age;
    protected String favouriteFood;

    public Animal(String name, int age, String favouriteFood) {
        this.name = name;
        this.age = age;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
}
