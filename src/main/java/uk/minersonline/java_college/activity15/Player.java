package uk.minersonline.java_college.activity15;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private final String name;
    private int health = 20;

    public Player(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void punch(Player other) {
        int damage = ThreadLocalRandom.current().nextInt(0, 5);
        other.health -= damage;
        System.out.println(this.name+" punched "+other.name+" for "+damage+" damage");
    }

    public void kick(Player other) {
        other.health -= 2;
        System.out.println(this.name+" kicked "+other.name+" for 2 damage");
    }
}
