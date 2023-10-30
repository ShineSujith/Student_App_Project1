package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //initialises scanner

        Student student1 = new Student();

        //student details are set using setters
        System.out.println("Enter student name: ");
        student1.setName(scanner.nextLine());
        System.out.println("Enter student email: ");
        student1.setEmail(scanner.nextLine());
        System.out.println("Enter student course: ");
        student1.setCourse(scanner.nextLine());

        //student details are set using a constructor and setters
        System.out.println("Enter student name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter student email: ");
        String email1 = scanner.nextLine();
        System.out.println("Enter student course: ");
        String course1 = scanner.nextLine();
        Student student2 = new Student(name1); //constructor is used to set the name
        student2.setEmail(email1);
        student2.setCourse(course1);

        //student details are set using a constructor
        System.out.println("Enter student name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter student email: ");
        String email2 = scanner.nextLine();
        System.out.println("Enter student course: ");
        String course2 = scanner.nextLine();
        Student student3 = new Student(name2, email2, course2);

        //student details are printed using getters
        System.out.println("\nStudent details");
        System.out.println("\nStudent 1 \nName: " + student1.getName());
        System.out.println("Email: " + student1.getEmail());
        System.out.println("Course: " + student1.getCourse());

        System.out.println("\nStudent 2 \nName: " + student2.getName());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("Course: " + student2.getCourse());

        System.out.println("\nStudent 3 \nName: " + student3.getName());
        System.out.println("Email: " + student3.getEmail());
        System.out.println("Course: " + student3.getCourse());
    }
}