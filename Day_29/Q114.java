// WAP to create menu driven array operations system
import java.util.*;

public class Q114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int size = 0;
        int choice;

        do {

            System.out.println("\n========== MENU DRIVEN ARRAY OPERATIONS ==========");
            System.out.println("1. Enter Array");
            System.out.println("2. Display Array");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Find Sum");
            System.out.println("6. Search Element");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Size of Array: ");
                    size = sc.nextInt();

                    System.out.println("Enter Array Elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.println("Array Entered Successfully!");
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        System.out.println("Array Elements:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (size == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        int max = arr[0];

                        for (int i = 1; i < size; i++) {
                            if (arr[i] > max) {
                                max = arr[i];
                            }
                        }

                        System.out.println("Maximum Element = " + max);
                    }
                    break;

                case 4:
                    if (size == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        int min = arr[0];

                        for (int i = 1; i < size; i++) {
                            if (arr[i] < min) {
                                min = arr[i];
                            }
                        }

                        System.out.println("Minimum Element = " + min);
                    }
                    break;

                case 5:
                    if (size == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        int sum = 0;

                        for (int i = 0; i < size; i++) {
                            sum += arr[i];
                        }

                        System.out.println("Sum of Elements = " + sum);
                    }
                    break;

                case 6:
                    if (size == 0) {
                        System.out.println("Array is Empty.");
                    } else {
                        System.out.print("Enter Element to Search: ");
                        int search = sc.nextInt();

                        boolean found = false;

                        for (int i = 0; i < size; i++) {
                            if (arr[i] == search) {
                                System.out.println("Element Found at Index " + i);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element Not Found.");
                        }
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