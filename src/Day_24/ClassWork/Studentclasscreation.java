package Day_24.ClassWork;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


class Student {

    private int studentId;
    private String studentName;
    private String department;
    private int year;


    public void addStudent(Scanner sc) {

        while (true) {
            try {
                System.out.print("Enter Student ID: ");
                studentId = sc.nextInt();

                if (studentId <= 0) {
                    System.out.println("Student ID must be positive.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Student ID must be a number.");
                sc.next(); // Remove invalid input
            }
        }

        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        while (true) {
            try {
                System.out.print("Enter Year: ");
                year = sc.nextInt();

                if (year < 1 || year > 4) {
                    System.out.println("Year must be between 1 and 4.");
                    continue;
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input! Year must be a number.");
                sc.next(); // Remove invalid input
            }
        }
    }

    // Display Student Details
    public void displayStudent() {

        System.out.println("\n------ Student Details ------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Year         : " + year);
        System.out.println("------------------------------");
    }

    // Getter Methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

// Main Class
public class Studentclasscreation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        while (true) {

            System.out.println("\n===== Student Management =====");
            System.out.println("1. Register Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        Student student = new Student();
                        student.addStudent(sc);
                        students.add(student);

                        System.out.println("\nStudent Registered Successfully!");
                        break;

                    case 2:

                        if (students.isEmpty()) {
                            System.out.println("\nNo students registered.");
                        } else {
                            System.out.println("\n===== Student List =====");
                            for (Student s : students) {
                                s.displayStudent();
                            }
                        }
                        break;

                    case 3:

                        System.out.println("\nThank You!");
                        sc.close();
                        return;

                    default:

                        System.out.println("Invalid Choice! Please enter 1, 2 or 3.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Please enter a number.");
                sc.next(); // Remove invalid input
            }
        }
    }
}