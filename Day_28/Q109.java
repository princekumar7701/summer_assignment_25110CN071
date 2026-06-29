// WAP to create library management system
import java.util.*;

public class Q109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[100];
        String[] bookName = new String[100];
        String[] author = new String[100];
        String[] publisher = new String[100];
        int[] quantity = new int[100];
        String[] issueStatus = new String[100];
        String[] studentName = new String[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n========== Library Management System ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    System.out.print("Enter Publisher Name: ");
                    publisher[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Is Book Issued (Yes/No): ");
                    issueStatus[count] = sc.nextLine();

                    if (issueStatus[count].equalsIgnoreCase("Yes")) {
                        System.out.print("Enter Student Name: ");
                        studentName[count] = sc.nextLine();
                    } else {
                        studentName[count] = "Not Issued";
                    }

                    count++;
                    System.out.println("\nBook Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo Books Available.");
                    } else {
                        System.out.println("\n========== Library Books ==========");
                        for (int i = 0; i < count; i++) {

                            System.out.println("--------------------------------------");
                            System.out.println("Book ID        : " + bookId[i]);
                            System.out.println("Book Name      : " + bookName[i]);
                            System.out.println("Author         : " + author[i]);
                            System.out.println("Publisher      : " + publisher[i]);
                            System.out.println("Quantity       : " + quantity[i]);
                            System.out.println("Issue Status   : " + issueStatus[i]);
                            System.out.println("Issued To      : " + studentName[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (bookId[i] == searchId) {

                            System.out.println("\nBook Found");
                            System.out.println("--------------------------------------");
                            System.out.println("Book ID        : " + bookId[i]);
                            System.out.println("Book Name      : " + bookName[i]);
                            System.out.println("Author         : " + author[i]);
                            System.out.println("Publisher      : " + publisher[i]);
                            System.out.println("Quantity       : " + quantity[i]);
                            System.out.println("Issue Status   : " + issueStatus[i]);
                            System.out.println("Issued To      : " + studentName[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("\nThank You for Using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}