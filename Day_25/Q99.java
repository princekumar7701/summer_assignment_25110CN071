//WAP to sort names alphabetically
import java.util.*;

public class Q99 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int num = sc.nextInt();
        sc.nextLine(); 
        String names[] = new String[num];
        System.out.println("Enter names:");
        for (int i = 0; i < num; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");
        for (int i = 0; i < num; i++) {
            System.out.println(names[i]);
        }
    }
}