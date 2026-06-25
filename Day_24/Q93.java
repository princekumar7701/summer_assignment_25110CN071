//WAP to check string rotation
import java.util.*;

public class Q93 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string = sc.nextLine();

        System.out.print("Enter second string: ");
        String string_2 = sc.nextLine();

        if (string.length() != string_2.length()) {
            System.out.println("Not Rotation");
        } else {
            String temp = string + string;

            if (temp.contains(string_2)) {
                System.out.println("String is Rotation");
            } else {
                System.out.println("String is Not Rotation");
            }
        }
    }
}