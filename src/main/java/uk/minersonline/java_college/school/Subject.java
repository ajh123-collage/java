package uk.minersonline.java_college.school;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final String name;
    private final List<Group> groups = new ArrayList<>();

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addClass(Group subject) {
        groups.add(subject);
    }
}
