// WAP to create employee management system
import java.util.*;

public class Q106 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        String[] email = new String[100];
        String[] address = new String[100];
        String[] contact = new String[100];
        double[] salary = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Email: ");
                    email[count] = sc.nextLine();

                    System.out.print("Enter Address: ");
                    address[count] = sc.nextLine();

                    System.out.print("Enter Contact Number: ");
                    contact[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    System.out.println("\nEmployee Record Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo Employee Records Found.");
                    } else {
                        System.out.println("\n========== Employee Records ==========");
                        for (int i = 0; i < count; i++) {
                            System.out.println("----------------------------------------");
                            System.out.println("Employee ID      : " + empId[i]);
                            System.out.println("Employee Name    : " + empName[i]);
                            System.out.println("Email            : " + email[i]);
                            System.out.println("Address          : " + address[i]);
                            System.out.println("Contact Number   : " + contact[i]);
                            System.out.println("Salary           : " + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Found");
                            System.out.println("----------------------------------------");
                            System.out.println("Employee ID      : " + empId[i]);
                            System.out.println("Employee Name    : " + empName[i]);
                            System.out.println("Email            : " + email[i]);
                            System.out.println("Address          : " + address[i]);
                            System.out.println("Contact Number   : " + contact[i]);
                            System.out.println("Salary           : " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Record Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("\nThank You for Using Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 4);

    sc.close();
    }
}