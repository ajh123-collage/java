package uk.minersonline.java_college.activity15;

import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private final String name;
    private int health = 20;

    public Player(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public DamageAction punch() {
        int damage = ThreadLocalRandom.current().nextInt(0, 5);
        return new DamageAction("punch", this, damage);
    }

    public DamageAction kick() {
        return new DamageAction("kick", this, 2);
    }

    public void calculateAction(Action action) {
        action.performAction(this);
    }
}
