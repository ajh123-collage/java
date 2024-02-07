package uk.minersonline.java_college.w4.a0;

public class w4a0Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Bob Marley");
        people[1] = new Person("Ebenezer Scrooge");
        people[2] = new Person("John Smith");

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
