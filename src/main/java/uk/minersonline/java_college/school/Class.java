package uk.minersonline.java_college.school;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
