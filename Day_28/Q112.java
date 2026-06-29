// WAP to Create Contact Management System
import java.util.*;

public class Q112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] contactId = new int[100];
        String[] name = new String[100];
        String[] mobile = new String[100];
        String[] email = new String[100];
        String[] address = new String[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== Contact Management System ==========");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    contactId[count] = 1001 + count;
                    System.out.println("Generated Contact ID : " + contactId[count]);

                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    mobile[count] = sc.nextLine();

                    System.out.print("Enter Email: ");
                    email[count] = sc.nextLine();

                    System.out.print("Enter Address: ");
                    address[count] = sc.nextLine();

                    count++;

                    System.out.println("\nContact Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("\nNo Contacts Found.");
                    } else {

                        System.out.println("\n========== Contact List ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("--------------------------------------");
                            System.out.println("Contact ID     : " + contactId[i]);
                            System.out.println("Name           : " + name[i]);
                            System.out.println("Mobile Number  : " + mobile[i]);
                            System.out.println("Email          : " + email[i]);
                            System.out.println("Address        : " + address[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Contact ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (contactId[i] == searchId) {

                            System.out.println("\nContact Found");
                            System.out.println("--------------------------------------");
                            System.out.println("Contact ID     : " + contactId[i]);
                            System.out.println("Name           : " + name[i]);
                            System.out.println("Mobile Number  : " + mobile[i]);
                            System.out.println("Email          : " + email[i]);
                            System.out.println("Address        : " + address[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("\nThank You for Using Contact Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}