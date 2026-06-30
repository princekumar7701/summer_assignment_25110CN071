// WAP to create student record system using arrays and strings
import java.util.*;

public class Q117 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        String[] course = new String[100];
        String[] address = new String[100];
        String[] mobile = new String[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== Student Record System ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    rollNo[count] = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Course: ");
                    course[count] = sc.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    mobile[count] = sc.nextLine();

                    System.out.print("Enter Address: ");
                    address[count] = sc.nextLine();

                    count++;

                    System.out.println("\nStudent Record Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Student Records Found.");
                    } else {

                        System.out.println("\n========== Student Records ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("--------------------------------------");
                            System.out.println("Roll Number   : " + rollNo[i]);
                            System.out.println("Name          : " + name[i]);
                            System.out.println("Course        : " + course[i]);
                            System.out.println("Mobile Number : " + mobile[i]);
                            System.out.println("Address       : " + address[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == searchRoll) {

                            System.out.println("\nStudent Found");
                            System.out.println("--------------------------------------");
                            System.out.println("Roll Number   : " + rollNo[i]);
                            System.out.println("Name          : " + name[i]);
                            System.out.println("Course        : " + course[i]);
                            System.out.println("Mobile Number : " + mobile[i]);
                            System.out.println("Address       : " + address[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Record Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You for Using Student Record System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}