import Model.student;
import service.StudentService;
import java.util.Scanner;
import util.DBConnection;


public class Main {

    public static void main(String[] args) {
        DBConnection.getConnection();

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");


            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    student student = new student(id, name, age, course, marks);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    student found = service.searchStudentById(sid);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int uage = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String ucourse = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double umarks = sc.nextDouble();

                    service.updateStudent(uid, uname, uage, ucourse, umarks);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    service.deleteStudent(did);
                    break;

                case 6:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return;


                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
