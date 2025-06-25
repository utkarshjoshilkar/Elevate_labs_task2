
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu
            System.out.println("\n----- Student Management Menu -----");
            System.out.println("1. Add a student");
            System.out.println("2. View a student");
            System.out.println("3. Update a student");
            System.out.println("4. Delete a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1 -> AddStudent(sc, students);
                case 2 -> ViewStudent(sc, students);
                case 3 -> UpdateStudent(sc, students);
                case 4 -> DeleteStudent(sc, students);
                default -> System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }

    private static Object AddStudent(Scanner sc, ArrayList<Student> students) {

        System.out.print("Enter student ID: ");
        int studentId = sc.nextInt();
        System.out.print("Enter student name: ");
        String studentName = sc.next();
        System.out.print("Enter student marks: ");
        float marks = sc.nextFloat();
        Student student = new Student(studentId, studentName, marks);
        students.add(student);
        System.out.println("Student added successfully!");
        return students;
    }

    private static void ViewStudent(Scanner sc, ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        } else {
            System.out.println("Enter the id of the student you want to see : ");
            int id = sc.nextInt();
            if (id < 0) {
                return;
            } else {
                Student serchStudent = new Student(id, "", 0.0f);

                for (Student s : students) {
                    if (s.equals(serchStudent)) {
                        s.ViewStudent();
                    }
                }
            }
        }
    }

    private static ArrayList<Student> UpdateStudent(Scanner sc, ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return null;
        } else {
            System.out.println("Enter the id of the student you want to Update : ");
            int id = sc.nextInt();

            if (id < 0) {
                return null;
            } else {
                Student updStudent = new Student(id, "", 0.0f);

                for (Student s : students) {
                    if (s.equals(updStudent)) {
                        System.out.println("Enter the marks : ");
                        float marks = sc.nextFloat();
                        s.editMarks(marks);
                    }
                }
            }
        }
        return students;
    }

    private static void DeleteStudent(Scanner sc, ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return ;
        } else {
            System.out.println("Enter the id of the student you want to delete : ");
            int id = sc.nextInt();
            if (id < 0) {
                return;
            } else {
                Student delStudent = new Student(id, "", 0.0f);

                for (Student s : students) {
                    if (s.equals(delStudent)) {
                        students.remove(s);
                        break;
                    }
                }
            }
        }
    }

}


