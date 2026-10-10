package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        System.out.println("========================================");
        System.out.println("   WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("========================================");

        do {
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.addStudent(scanner);
                    break;
                case 2:
                    manager.viewStudents();
                    break;
                case 3:
                    manager.searchStudent(scanner);
                    break;
                case 4:
                    manager.deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please enter between 1-5.\n");
            }
        } while (choice != 5);

        scanner.close();
    }
}