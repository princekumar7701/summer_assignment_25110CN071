// WAP to create marksheet generation system
import java.util.*;

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] roll = new int[100];
        String[] name = new String[100];
        double[] english = new double[100];
        double[] hindi = new double[100];
        double[] maths = new double[100];
        double[] science = new double[100];
        double[] computer = new double[100];

        double[] total = new double[100];
        double[] percentage = new double[100];
        String[] grade = new String[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n====== Marksheet Generation System ======");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();
                    sc.nextLine(); // Buffer Clear

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter English Marks: ");
                    english[count] = sc.nextDouble();

                    System.out.print("Enter Hindi Marks: ");
                    hindi[count] = sc.nextDouble();

                    System.out.print("Enter Maths Marks: ");
                    maths[count] = sc.nextDouble();

                    System.out.print("Enter Science Marks: ");
                    science[count] = sc.nextDouble();

                    System.out.print("Enter Computer Marks: ");
                    computer[count] = sc.nextDouble();

                    total[count] = english[count] + hindi[count] + maths[count]
                            + science[count] + computer[count];

                    percentage[count] = total[count] / 5;

                    if (percentage[count] >= 90)
                        grade[count] = "A+";
                    else if (percentage[count] >= 80)
                        grade[count] = "A";
                    else if (percentage[count] >= 70)
                        grade[count] = "B";
                    else if (percentage[count] >= 60)
                        grade[count] = "C";
                    else if (percentage[count] >= 40)
                        grade[count] = "D";
                    else
                        grade[count] = "Fail";

                    count++;
                    System.out.println("Marksheet Generated Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\n========== MARKSHEETS ==========");
                        for (int i = 0; i < count; i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Roll No    : " + roll[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("English    : " + english[i]);
                            System.out.println("Hindi      : " + hindi[i]);
                            System.out.println("Maths      : " + maths[i]);
                            System.out.println("Science    : " + science[i]);
                            System.out.println("Computer   : " + computer[i]);
                            System.out.println("Total      : " + total[i]);
                            System.out.println("Percentage : " + percentage[i] + "%");
                            System.out.println("Grade      : " + grade[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == search) {
                            System.out.println("\nStudent Found");
                            System.out.println("--------------------------------------");
                            System.out.println("Roll No    : " + roll[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("English    : " + english[i]);
                            System.out.println("Hindi      : " + hindi[i]);
                            System.out.println("Maths      : " + maths[i]);
                            System.out.println("Science    : " + science[i]);
                            System.out.println("Computer   : " + computer[i]);
                            System.out.println("Total      : " + total[i]);
                            System.out.println("Percentage : " + percentage[i] + "%");
                            System.out.println("Grade      : " + grade[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Record Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}