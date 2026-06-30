// WAP to create mini library management system
import java.util.*;

public class Q118 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int[] bookId = new int[100];
        String[] bookName = new String[100];
        String[] author = new String[100];
        int[] quantity = new int[100];

    
        int[] memberId = new int[100];
        String[] memberName = new String[100];
        String[] mobile = new String[100];

    
        int[] issueBookId = new int[100];
        int[] issueMemberId = new int[100];
        String[] issueDate = new String[100];
        String[] returnDate = new String[100];

        int bookCount = 0;
        int memberCount = 0;
        int issueCount = 0;

        int choice;

        do {

            System.out.println("\n========== MINI LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. Display Members");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Display Issue Records");
            System.out.println("9. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice){

                case 1:

                    bookId[bookCount] = 1001 + bookCount;
                    System.out.println("Generated Book ID : " + bookId[bookCount]);

                    sc.nextLine();

                    System.out.print("Enter Book Name : ");
                    bookName[bookCount] = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    author[bookCount] = sc.nextLine();

                    System.out.print("Enter Quantity : ");
                    quantity[bookCount] = sc.nextInt();

                    bookCount++;

                    System.out.println("Book Added Successfully!");

                    break;                case 2:

                    if (bookCount == 0) {
                        System.out.println("No Books Available.");
                    } else {

                        System.out.println("\n========== BOOK LIST ==========");

                        for (int i = 0; i < bookCount; i++) {

                            System.out.println("--------------------------------");
                            System.out.println("Book ID      : " + bookId[i]);
                            System.out.println("Book Name    : " + bookName[i]);
                            System.out.println("Author       : " + author[i]);
                            System.out.println("Quantity     : " + quantity[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to Search : ");
                    int searchBook = sc.nextInt();

                    boolean foundBook = false;

                    for (int i = 0; i < bookCount; i++) {

                        if (bookId[i] == searchBook) {

                            System.out.println("\nBook Found");
                            System.out.println("----------------------------");
                            System.out.println("Book ID      : " + bookId[i]);
                            System.out.println("Book Name    : " + bookName[i]);
                            System.out.println("Author       : " + author[i]);
                            System.out.println("Quantity     : " + quantity[i]);

                            foundBook = true;
                            break;
                        }
                    }

                    if (!foundBook) {
                        System.out.println("Book Not Found.");
                    }

                    break;

                case 4:

                    memberId[memberCount] = 501 + memberCount;
                    System.out.println("Generated Member ID : " + memberId[memberCount]);

                    sc.nextLine();

                    System.out.print("Enter Member Name : ");
                    memberName[memberCount] = sc.nextLine();

                    System.out.print("Enter Mobile Number : ");
                    mobile[memberCount] = sc.nextLine();

                    memberCount++;

                    System.out.println("Member Added Successfully!");

                    break;                case 5:

                    if (memberCount == 0) {
                        System.out.println("No Members Found.");
                    } else {

                        System.out.println("\n========== MEMBER LIST ==========");

                        for (int i = 0; i < memberCount; i++) {

                            System.out.println("--------------------------------");
                            System.out.println("Member ID      : " + memberId[i]);
                            System.out.println("Member Name    : " + memberName[i]);
                            System.out.println("Mobile Number  : " + mobile[i]);
                        }
                    }

                    break;

                case 6:

                    System.out.print("Enter Book ID : ");
                    issueBookId[issueCount] = sc.nextInt();

                    System.out.print("Enter Member ID : ");
                    issueMemberId[issueCount] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Issue Date (DD/MM/YYYY) : ");
                    issueDate[issueCount] = sc.nextLine();

                    
                    for (int i = 0; i < bookCount; i++) {
                        if (bookId[i] == issueBookId[issueCount]) {
                            if (quantity[i] > 0) {
                                quantity[i]--;
                            } else {
                                System.out.println("Book Out of Stock!");
                            }
                        }
                    }

                    issueCount++;

                    System.out.println("Book Issued Successfully!");

                    break;

                case 7:

                    System.out.print("Enter Book ID : ");
                    int returnBook = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Return Date (DD/MM/YYYY) : ");
                    String rDate = sc.nextLine();

                    for (int i = 0; i < issueCount; i++) {

                        if (issueBookId[i] == returnBook) {

                            returnDate[i] = rDate;

                        
                            for (int j = 0; j < bookCount; j++) {
                                if (bookId[j] == returnBook) {
                                    quantity[j]++;
                                    break;
                                }
                            }

                            System.out.println("Book Returned Successfully!");
                            break;
                        }
                    }

                    break;                case 8:

                    if (issueCount == 0) {
                        System.out.println("No Issue Records Found.");
                    } else {

                        System.out.println("\n========== ISSUE RECORDS ==========");

                        for (int i = 0; i < issueCount; i++) {

                            System.out.println("--------------------------------");
                            System.out.println("Book ID      : " + issueBookId[i]);
                            System.out.println("Member ID    : " + issueMemberId[i]);
                            System.out.println("Issue Date   : " + issueDate[i]);

                            if (returnDate[i] == null) {
                                System.out.println("Return Date  : Not Returned");
                            } else {
                                System.out.println("Return Date  : " + returnDate[i]);
                            }
                        }
                    }

                    break;

                case 9:

                    System.out.println("Thank You for Using Mini Library Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}