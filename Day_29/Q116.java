// WAP to create inventory management system
import java.util.*;

public class Q116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] productId = new int[100];
        String[] productName = new String[100];
        String[] category = new String[100];
        int[] quantity = new int[100];
        double[] price = new double[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== Inventory Management System ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    productId[count] = 1001 + count;
                    System.out.println("Generated Product ID : " + productId[count]);

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName[count] = sc.nextLine();

                    System.out.print("Enter Product Category: ");
                    category[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    System.out.print("Enter Price: ");
                    price[count] = sc.nextDouble();

                    count++;

                    System.out.println("\nProduct Added Successfully!");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Products Available.");
                    } else {

                        System.out.println("\n========== Product List ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("--------------------------------------");
                            System.out.println("Product ID       : " + productId[i]);
                            System.out.println("Product Name     : " + productName[i]);
                            System.out.println("Category         : " + category[i]);
                            System.out.println("Quantity         : " + quantity[i]);
                            System.out.println("Price            : " + price[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (productId[i] == searchId) {

                            System.out.println("\nProduct Found");
                            System.out.println("--------------------------------------");
                            System.out.println("Product ID       : " + productId[i]);
                            System.out.println("Product Name     : " + productName[i]);
                            System.out.println("Category         : " + category[i]);
                            System.out.println("Quantity         : " + quantity[i]);
                            System.out.println("Price            : " + price[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You for Using Inventory Management System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}