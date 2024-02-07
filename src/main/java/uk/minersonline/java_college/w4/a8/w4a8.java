package uk.minersonline.java_college.w4.a8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class w4a8 {
    public static void main(String[] args) {
        List<Boolean> booleans = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int day = 1; day <= 7; day++) {
            System.out.println("Do you like day "+day+"?");
            System.out.println("inputting `yes` is the only way to say yes");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase( "yes")) {
                booleans.add(true);
            }
        }

        for (boolean bool : booleans) {
            System.out.println(bool);
        }
    }
}
