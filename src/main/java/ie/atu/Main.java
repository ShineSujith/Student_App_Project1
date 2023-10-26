package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();

        System.out.println("Enter student name: ");
        student1.setName(scanner.nextLine());
        System.out.println("Enter student email: ");
        student1.setEmail(scanner.nextLine());
        System.out.println("Enter student course: ");
        student1.setCourse(scanner.nextLine());

        System.out.println("Enter student name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter student email: ");
        String email1 = scanner.nextLine();
        System.out.println("Enter student course: ");
        String course1 = scanner.nextLine();
        Student student2 = new Student(name1);
        student2.setEmail(email1);
        student2.setCourse(course1);

        System.out.println("Enter student name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter student email: ");
        String email2 = scanner.nextLine();
        System.out.println("Enter student course: ");
        String course2 = scanner.nextLine();
        Student student3 = new Student(name2, email2, course2);

        System.out.println("Name: " + student1.getName());
        System.out.println("Email " + student1.getEmail());
        System.out.println("Course " + student1.getCourse());

        System.out.println("Name: " + student2.getName());
        System.out.println("Email " + student2.getEmail());
        System.out.println("Course " + student2.getCourse());

        System.out.println("Name: " + student3.getName());
        System.out.println("Email " + student3.getEmail());
        System.out.println("Course " + student3.getCourse());
    }
}