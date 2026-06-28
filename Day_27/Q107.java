// WAP to create salary management system
import java.util.*;

public class Q107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId[] = new int[100];
        String empName[] = new String[100];
        double basic[] = new double[100];
        double hra[] = new double[100];
        double da[] = new double[100];
        double pf[] = new double[100];
        double netSalary[] = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n====== Salary Management System ======");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Search Employee Salary");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine(); // Buffer Clear

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basic[count] = sc.nextDouble();

    
                    hra[count] = basic[count] * 0.20;   
                    da[count] = basic[count] * 0.10;    
                    pf[count] = basic[count] * 0.05;    

                    netSalary[count] = basic[count] + hra[count] + da[count] - pf[count];

                    count++;

                    System.out.println("Salary Record Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\n====== Salary Details ======");
                        for (int i = 0; i < count; i++) {
                            System.out.println("-----------------------------------");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Basic       : " + basic[i]);
                            System.out.println("HRA         : " + hra[i]);
                            System.out.println("DA          : " + da[i]);
                            System.out.println("PF          : " + pf[i]);
                            System.out.println("Net Salary  : " + netSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == search) {
                            System.out.println("\nEmployee Found");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Basic       : " + basic[i]);
                            System.out.println("HRA         : " + hra[i]);
                            System.out.println("DA          : " + da[i]);
                            System.out.println("PF          : " + pf[i]);
                            System.out.println("Net Salary  : " + netSalary[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee Record Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}