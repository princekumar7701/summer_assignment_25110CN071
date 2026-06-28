//WAP to create student record management system
import java.util.*;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 int roll[] = new int[100];
        String name[] = new String[100];
        double marks[] = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();
                 sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();
                

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;
                    System.out.println("Student record added successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("--------------------------------");
                            System.out.println("Roll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Marks   : " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == searchRoll) {
                            System.out.println("\nStudent Found");
                            System.out.println("Roll No : " + roll[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Marks   : " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student record not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Student Record Management System.");
                    break;

               default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();

        
    
    }
    }