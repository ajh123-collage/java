package uk.minersonline.java_college.activity15;

public interface Action {
    void performAction(Player other);

    Player getSender();
}
