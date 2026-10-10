package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("✅ Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.\n");
            return;
        }
        System.out.println("--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void searchStudent(Scanner scanner) {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("🎯 Found: " + s + "\n");
                return;
            }
        }
        System.out.println("❌ Student with ID " + id + " not found.\n");
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("🗑️ Student deleted successfully!\n");
        } else {
            System.out.println("❌ Student with ID " + id + " not found.\n");
        }
    }
}