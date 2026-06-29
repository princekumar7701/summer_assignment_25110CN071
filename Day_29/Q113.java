// WAP to create menu driven calculator
import java.util.*;
public class Q113 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      int choice;
        double num1, num2, result;
        do {
            System.out.println("\n========== MENU DRIVEN CALCULATOR ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.println("Addition = " + result);
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;

                    System.out.println("Subtraction = " + result);
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;

                    System.out.println("Multiplication = " + result);
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division = " + result);
                    } else {
                        System.out.println("Division by Zero is Not Possible.");
                    }
                    break;

                case 5:
                    System.out.print("Enter First Number: ");
                    int a = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    int b = sc.nextInt();

                    if (b != 0) {
                        System.out.println("Modulus = " + (a % b));
                    } else {
                        System.out.println("Modulus by Zero is Not Possible.");
                    }
                    break;

                case 6:
                    System.out.println("Thank You for Using Calculator.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}