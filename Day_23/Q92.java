//WAP to  find maximum occuring character
import java.util.*;

public class Q92 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = sc.nextLine();

        char maxchar = string.charAt(0);
        int maxcount = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int count = 0;

            for (int j = 0; j < string.length(); j++) {
                if (ch == string.charAt(j)) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                maxchar = ch;
            }
        }

        System.out.println("Maximum occurring character is: " + maxchar+" with "+maxcount+" times");
    
    }
}