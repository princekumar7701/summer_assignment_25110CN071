// WAP to Create Ticket Booking System
import java.util.*;

public class Q111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ticketId = new int[100];
        String[] source = new String[100];
        String[] destination = new String[100];
        String[] travelDate = new String[100];
        int[] noOfPassengers = new int[100];

        
        String[][] passengerName = new String[100][10];
        String[][] aadharNo = new String[100][10];
        String[][] seatNo = new String[100][10];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== Ticket Booking System ==========");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display All Bookings");
            System.out.println("3. Search Booking");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Source: ");
                    source[count] = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    destination[count] = sc.nextLine();

                    System.out.print("Enter Travel Date (DD/MM/YYYY): ");
                    travelDate[count] = sc.nextLine();

                    System.out.print("Enter Number of Passengers: ");
                    noOfPassengers[count] = sc.nextInt();
                    sc.nextLine();

                    for (int j = 0; j < noOfPassengers[count]; j++) {

                        System.out.println("\nPassenger " + (j + 1));

                        System.out.print("Enter Passenger Name: ");
                        passengerName[count][j] = sc.nextLine();

                        System.out.print("Enter Aadhaar Number: ");
                        aadharNo[count][j] = sc.nextLine();

                        System.out.print("Enter Seat Number: ");
                        seatNo[count][j] = sc.nextLine();
                    }

                

                    ticketId[count] = 1001 + count;

                    System.out.println("\nGenerated Ticket ID : " + ticketId[count]);
                    System.out.println("Ticket Booked Successfully!");

                    count++;

                    break;                case 2:

                    if (count == 0) {
                        System.out.println("\nNo Booking Records Found.");
                    } else {

                        System.out.println("\n========== Ticket Booking Records ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println("\n--------------------------------------------");
                            System.out.println("Ticket ID            : " + ticketId[i]);
                            System.out.println("Source               : " + source[i]);
                            System.out.println("Destination          : " + destination[i]);
                            System.out.println("Travel Date          : " + travelDate[i]);
                            System.out.println("No. of Passengers    : " + noOfPassengers[i]);
                        

                            System.out.println("\nPassenger Details");

                            for (int j = 0; j < noOfPassengers[i]; j++) {

                                System.out.println("-----------------------------");
                                System.out.println("Passenger " + (j + 1));
                                System.out.println("Name         : " + passengerName[i][j]);
                                System.out.println("Aadhaar No   : " + aadharNo[i][j]);
                                System.out.println("Seat Number  : " + seatNo[i][j]);
                            }
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Ticket ID to Search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (ticketId[i] == search) {

                            found = true;

                            System.out.println("\n========== Ticket Found ==========");
                            System.out.println("Ticket ID            : " + ticketId[i]);
                            System.out.println("Source               : " + source[i]);
                            System.out.println("Destination          : " + destination[i]);
                            System.out.println("Travel Date          : " + travelDate[i]);
                            System.out.println("No. of Passengers    : " + noOfPassengers[i]);
                            

                            System.out.println("\nPassenger Details");

                            for (int j = 0; j < noOfPassengers[i]; j++) {

                                System.out.println("-----------------------------");
                                System.out.println("Passenger " + (j + 1));
                                System.out.println("Name         : " + passengerName[i][j]);
                                System.out.println("Aadhaar No   : " + aadharNo[i][j]);
                                System.out.println("Seat Number  : " + seatNo[i][j]);
                            }

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Ticket Not Found.");
                    }

                    break;

                case 4:

                    System.out.println("\nThank You for Using Ticket Booking System.");
                    break;

                default:

                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 4);

        sc.close();
    }
}