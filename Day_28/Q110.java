// WAP to create Bank account system
import java.util.*;

public class Q110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] accountNo = new int[100];
        String[] holderName = new String[100];
        String[] accountType = new String[100];
        String[] mobile = new String[100];
        String[] aadharNo = new String[100];
        String[] panNo = new String[100];
        String[] address = new String[100];
        double[] balance = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n========== Bank Account System ==========");
            System.out.println("1. Create Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    accountNo[count] = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Account Holder Name: ");
                    holderName[count] = sc.nextLine();

                    System.out.print("Enter Account Type (Saving/Current): ");
                    accountType[count] = sc.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    mobile[count] = sc.nextLine();

                    System.out.print("Enter Aadhaar Number: ");
                    aadharNo[count] = sc.nextLine();

                    System.out.print("Enter PAN Number: ");
                    panNo[count] = sc.nextLine();

                    System.out.print("Enter Address: ");
                    address[count] = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance[count] = sc.nextDouble();

                    count++;

                    System.out.println("\nBank Account Created Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("\nNo Account Records Found.");
                    } else {

                        System.out.println("\n========== Bank Account Records ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("--------------------------------------------");
                            System.out.println("Account Number : " + accountNo[i]);
                            System.out.println("Holder Name    : " + holderName[i]);
                            System.out.println("Account Type   : " + accountType[i]);
                            System.out.println("Mobile Number  : " + mobile[i]);
                            System.out.println("Aadhaar Number : " + aadharNo[i]);
                            System.out.println("PAN Number     : " + panNo[i]);
                            System.out.println("Address        : " + address[i]);
                            System.out.println("Balance        : " + balance[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Account Number to Search: ");
                    int searchAcc = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (accountNo[i] == searchAcc) {

                            System.out.println("\nAccount Found");
                            System.out.println("--------------------------------------------");
                            System.out.println("Account Number : " + accountNo[i]);
                            System.out.println("Holder Name    : " + holderName[i]);
                            System.out.println("Account Type   : " + accountType[i]);
                            System.out.println("Mobile Number  : " + mobile[i]);
                            System.out.println("Aadhaar Number : " + aadharNo[i]);
                            System.out.println("PAN Number     : " + panNo[i]);
                            System.out.println("Address        : " + address[i]);
                            System.out.println("Balance        : " + balance[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("\nThank You for Using Bank Account System.");
                    break;

                default:

                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 4);

        sc.close();
    }
}