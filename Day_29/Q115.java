//WAP to create menu driven string operations system
import java.util.*;
public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int choice;
        do {
            System.out.println("\n========== MENU DRIVEN STRING OPERATIONS ==========");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("Enter a String: ");
                    str = sc.nextLine();
                    System.out.println("String Stored Successfully!");
                    break;

                case 2:
                    if (str.equals("")) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("String = " + str);
                    }
                    break;

                case 3:
                    if (str.equals("")) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("Length = " + str.length());
                    }
                    break;

                case 4:
                    if (str.equals("")) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("Uppercase = " + str.toUpperCase());
                    }
                    break;

                case 5:
                    if (str.equals("")) {
                        System.out.println("No String Entered.");
                    } else {
                        System.out.println("Lowercase = " + str.toLowerCase());
                    }
                    break;

                case 6:
                    if (str.equals("")) {
                        System.out.println("No String Entered.");
                    } else {

                        String rev = "";

                        for (int i = str.length() - 1; i >= 0; i--) {
                            rev = rev + str.charAt(i);
                        }

                        System.out.println("Reverse String = " + rev);
                    }
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}