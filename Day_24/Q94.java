//WAP to compress string
import java.util.*;
public class Q94 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 &&
                   str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            System.out.print(str.charAt(i) + "" + count);

            count = 1;
        }
    }
}