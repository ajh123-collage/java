package uk.minersonline.java_college.starters.pokemon;

public class Pokemon {
    protected final String name;
    protected int level;
    protected final String nature;

    public Pokemon(String name, int level, String nature) {
        this.name = name;
        this.level = level;
        this.nature = nature;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getNature() {
        return nature;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void jump() {
        System.out.println(name + " has jumped!");
    }

    public void cry() {
        System.out.println(name + " is now crying.");
    }
}
