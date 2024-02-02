package uk.minersonline.java_college.starters.pokemon;

public class FireTypePokemon extends Pokemon{
    public FireTypePokemon(String name, int level, String nature) {
        super(name, level, nature);
    }

    public void flamethrower() {
        System.out.println(this.name + " has used the flamethrower.");
    }

    public void lavathrower() {
        System.out.println(this.name + " has used the lavethrower.");
    }
}
