package uk.minersonline.java_college.starters.pokemon;

public class GrassTypePokemon extends Pokemon{
    public GrassTypePokemon(String name, int level, String nature) {
        super(name, level, nature);
    }

    @Override
    public void jump() {
        System.out.println(this.name + " has fell over.");
        this.cry();
    }

    public void grow() {
        System.out.println(this.name + " has grown.");
    }

    public void sprout() {
        System.out.println(this.name + " has sprouted");
    }
}
