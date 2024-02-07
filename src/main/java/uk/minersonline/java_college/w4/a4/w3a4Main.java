package uk.minersonline.java_college.w4.a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class w3a4Main {
    public static void main(String[] args) {
        List<String> teachers = new ArrayList<>();
        teachers.add("Nic");
        teachers.add("Alex");
        teachers.add("Barry");
        teachers.add("Jennie");

        System.out.println(teachers);

        teachers.add(1, "Jennie");

        System.out.println(teachers);

        int barry = teachers.indexOf("Barry");
        teachers.set(barry, "Nic");

        System.out.println(teachers);

        teachers.removeAll(List.of("Nic"));

        System.out.println(teachers);

        int jennie = teachers.indexOf("Jennie");
        teachers.remove(jennie);

        System.out.println(teachers);

        teachers.replaceAll(teacher -> {
            if (teacher.equals("Alex")) {
                return "Nic";
            }
            return teacher;
        });

        System.out.println(teachers);

        teachers.add(
            teachers.size() - 1,
            "Barry"
        );

        System.out.println(teachers);

        Collections.sort(teachers);

        System.out.println(teachers);
    }
}
