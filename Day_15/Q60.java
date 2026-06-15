//WAP to move zeroes to end 
import java.util.*;

public class Q60 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int number[] = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter element at " + i + " index: ");
            number[i] = sc.nextInt();
        }

        int index = 0;
        for(int i = 0; i < size; i++) {
            if(number[i] != 0) {
                number[index] = number[i];
                index++;
            }
        }
        while(index < size) {
            number[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros to the end:");
        for(int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }
}