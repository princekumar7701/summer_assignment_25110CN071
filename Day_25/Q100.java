//WAP to sort words by length
import java.util.*;

public class Q100 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int num = sc.nextInt();
        sc.nextLine();
        String words[] = new String[num];
        System.out.println("Enter words:");
        for (int i = 0; i < num; i++) {
            words[i] = sc.nextLine();
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("Words sorted by length:");
        for (int i = 0; i < num; i++) {
            System.out.println(words[i]);
        }
    }
}