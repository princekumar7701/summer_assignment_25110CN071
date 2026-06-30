import java.util.Scanner;

public class Q120 {

    static final int MAX_CUSTOMERS = 50;
    static final int ROOM_CHARGE = 1000;

    static int[] roomNo = new int[MAX_CUSTOMERS];
    static String[] name = new String[MAX_CUSTOMERS];
    static String[] phone = new String[MAX_CUSTOMERS];
    static int[] days = new int[MAX_CUSTOMERS];
    static double[] bill = new double[MAX_CUSTOMERS];
    static boolean[] booked = new boolean[MAX_CUSTOMERS];

    static Scanner sc = new Scanner(System.in);

    static void initializeRooms() {
        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            roomNo[i] = i + 1;
            name[i] = "";
            phone[i] = "";
            days[i] = 0;
            bill[i] = 0;
            booked[i] = false;
        }
    }static void addCustomer() {
        System.out.print("\nEnter Room Number (1-" + MAX_CUSTOMERS + "): ");
        int room = sc.nextInt();
        sc.nextLine();

        if (room < 1 || room > MAX_CUSTOMERS) {
            System.out.println("Invalid Room Number!");
            return;
        }

        if (booked[room - 1]) {
            System.out.println("Room Already Booked!");
            return;
        }

        System.out.print("Enter Customer Name: ");
        name[room - 1] = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone[room - 1] = sc.nextLine();

        System.out.print("Enter Number Of Days: ");
        days[room - 1] = sc.nextInt();

        bill[room - 1] = days[room - 1] * ROOM_CHARGE;
        booked[room - 1] = true;

        System.out.println("\nCustomer Added Successfully!");
    }

    static void displayCustomers() {
        boolean found = false;

        System.out.println("\n===== CUSTOMER RECORDS =====");

        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            if (booked[i]) {
                System.out.println("\nRoom No : " + roomNo[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Phone   : " + phone[i]);
                System.out.println("Days    : " + days[i]);
                System.out.println("Bill    : " + bill[i]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No Customer Records Found.");
        }
    }

    static void searchCustomer() {
        sc.nextLine();
        System.out.print("\nEnter Customer Name To Search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            if (booked[i] && name[i].equalsIgnoreCase(searchName)) {

                System.out.println("\nCustomer Found!");
                System.out.println("Room No : " + roomNo[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Phone   : " + phone[i]);
                System.out.println("Days    : " + days[i]);
                System.out.println("Bill    : " + bill[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer Not Found!");
        }
    }static void updateCustomer() {
        System.out.print("\nEnter Room Number To Update: ");
        int room = sc.nextInt();
        sc.nextLine();

        if (room < 1 || room > MAX_CUSTOMERS) {
            System.out.println("Invalid Room Number!");
            return;
        }

        if (!booked[room - 1]) {
            System.out.println("No Customer Found In This Room!");
            return;
        }

        System.out.print("Enter New Customer Name: ");
        name[room - 1] = sc.nextLine();

        System.out.print("Enter New Phone Number: ");
        phone[room - 1] = sc.nextLine();

        System.out.print("Enter New Number Of Days: ");
        days[room - 1] = sc.nextInt();

        bill[room - 1] = days[room - 1] * ROOM_CHARGE;

        System.out.println("\nCustomer Record Updated Successfully!");
    }

    static void deleteCustomer() {
        System.out.print("\nEnter Room Number To Delete Customer: ");
        int room = sc.nextInt();

        if (room < 1 || room > MAX_CUSTOMERS) {
            System.out.println("Invalid Room Number!");
            return;
        }

        if (!booked[room - 1]) {
            System.out.println("No Customer Record Found!");
            return;
        }

        booked[room - 1] = false;
        name[room - 1] = "";
        phone[room - 1] = "";
        days[room - 1] = 0;
        bill[room - 1] = 0;

        System.out.println("\nCustomer Deleted Successfully!");
    }static void bookRoom() {
        System.out.print("\nEnter Room Number To Book: ");
        int room = sc.nextInt();

        if (room < 1 || room > MAX_CUSTOMERS) {
            System.out.println("Invalid Room Number!");
            return;
        }

        if (booked[room - 1]) {
            System.out.println("Room Already Booked!");
        } else {
            System.out.println("Room " + room + " Is Available For Booking.");
        }
    }

    static void checkOut() {
        System.out.print("\nEnter Room Number For Check Out: ");
        int room = sc.nextInt();

        if (room < 1 || room > MAX_CUSTOMERS) {
            System.out.println("Invalid Room Number!");
            return;
        }

        if (!booked[room - 1]) {
            System.out.println("Room Is Already Empty!");
            return;
        }

        System.out.println("\nCustomer Checked Out Successfully!");
        System.out.println("Final Bill = " + bill[room - 1]);

        booked[room - 1] = false;
        name[room - 1] = "";
        phone[room - 1] = "";
        days[room - 1] = 0;
        bill[room - 1] = 0;
    }static void showAvailableRooms() {
        boolean found = false;

        System.out.println("\n===== AVAILABLE ROOMS =====");

        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            if (!booked[i]) {
                System.out.println("Room No : " + roomNo[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Rooms Available.");
        }
    }

    static void showBookedRooms() {
        boolean found = false;

        System.out.println("\n===== BOOKED ROOMS =====");

        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            if (booked[i]) {
                System.out.println("\nRoom No : " + roomNo[i]);
                System.out.println("Customer: " + name[i]);
                System.out.println("Phone   : " + phone[i]);
                System.out.println("Days    : " + days[i]);
                System.out.println("Bill    : " + bill[i]);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No Rooms Are Booked.");
        }
    }

    static void generateBill() {
        System.out.print("\nEnter Room Number: ");
        int room = sc.nextInt();

        if (room < 1 || room > MAX_CUSTOMERS) {
            System.out.println("Invalid Room Number!");
            return;
        }

        if (!booked[room - 1]) {
            System.out.println("No Customer In This Room!");
            return;
        }

        System.out.println("\n========== BILL ==========");
        System.out.println("Customer Name : " + name[room - 1]);
        System.out.println("Room Number   : " + roomNo[room - 1]);
        System.out.println("Days Stayed   : " + days[room - 1]);
        System.out.println("Room Charge   : " + ROOM_CHARGE + " Per Day");
        System.out.println("Total Bill    : " + bill[room - 1]);
    }static void totalCustomers() {
        int count = 0;

        for (int i = 0; i < MAX_CUSTOMERS; i++) {
            if (booked[i]) {
                count++;
            }
        }

        System.out.println("\nTotal Customers : " + count);
    }

    public static void main(String args[]) {

        initializeRooms();

        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println("      HOTEL MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Customer");
            System.out.println("2. Display Customers");
            System.out.println("3. Search Customer");
            System.out.println("4. Update Customer");
            System.out.println("5. Delete Customer");
            System.out.println("6. Book Room");
            System.out.println("7. Check Out");
            System.out.println("8. Show Available Rooms");
            System.out.println("9. Show Booked Rooms");
            System.out.println("10. Generate Bill");
            System.out.println("11. Total Customers");
            System.out.println("12. Exit");

            System.out.print("\nEnter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addCustomer();
                    break;

                case 2:
                    displayCustomers();
                    break;

                case 3:
                    searchCustomer();
                    break;

                case 4:
                    updateCustomer();
                    break;

                case 5:
                    deleteCustomer();
                    break;

                case 6:
                    bookRoom();
                    break;

                case 7:
                    checkOut();
                    break;

                case 8:
                    showAvailableRooms();
                    break;

                case 9:
                    showBookedRooms();
                    break;

                case 10:
                    generateBill();
                    break;

                case 11:
                    totalCustomers();
                    break;

                case 12:
                    System.out.println("\nThank You For Using Hotel Management System.");
                    break;

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }

        } while (choice != 12);
    }
}