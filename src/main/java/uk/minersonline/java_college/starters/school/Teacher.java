package uk.minersonline.java_college.starters.school;

public class Teacher {
    private final String name;
    private Subject subject;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + subject.getName() + "... Bla bla bla");
    }
}
