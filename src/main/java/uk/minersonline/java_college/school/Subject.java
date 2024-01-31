package uk.minersonline.java_college.school;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final String name;
    private final List<Class> classes = new ArrayList<>();

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void addClass(Class subject) {
        classes.add(subject);
    }
}
