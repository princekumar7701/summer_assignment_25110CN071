import java.util.*;

public class Q90 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            for (int j = i + 1; j < string.length(); j++) {
                if (ch == string.charAt(j)) {
                    System.out.println("First repeating character is: " + ch);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No repeating character found.");
        }
    }
}