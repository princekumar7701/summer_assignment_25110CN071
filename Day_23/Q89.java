//WAP to find first non repeating character
import java.util.*;

public class Q89 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = sc.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int count = 0;

            for (int j = 0; j < string.length(); j++) {
                if (ch == string.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating character is: " + ch);
                break;
            }
        }
    }
}