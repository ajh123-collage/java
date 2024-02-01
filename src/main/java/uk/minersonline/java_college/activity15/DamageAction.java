package uk.minersonline.java_college.activity15;

public class DamageAction implements Action {
    private final String type;
    private final Player sender;
    private final int health;

    public DamageAction(String type, Player sender, int health) {
        this.type = type;
        this.sender = sender;
        this.health = health;
    }

    public Player getSender() {
        return sender;
    }

    @Override
    public void performAction(Player other) {
        other.setHealth(other.getHealth() - health);
        System.out.println(sender.getName()+" "+type+"ed "+other.getName()+" for "+health+" damage");
        System.out.println(other.getName()+" now has "+other.getHealth()+" health.");
        System.out.println(sender.getName()+" has "+sender.getHealth()+" health.");
    }
}
