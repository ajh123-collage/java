package uk.minersonline.java_college.starters.school;

public class SchoolMain {
    public static void main(String[] args) {
        Student student1 = new Student("Bob Marley");
        Student student2 = new Student("Ebenezer Scrooge");

        Group group = new Group();
        group.addStudent(student1);
        group.addStudent(student2);

        Subject subject = new Subject("Science");

        Teacher teacher = new Teacher("Alex Bowker");
        teacher.setSubject(subject);

        teacher.teach();
    }
}
