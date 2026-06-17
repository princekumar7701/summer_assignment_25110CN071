//WAP to find missing number in array
import java.util.*;

public class Q61 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (numbers are from 1 to n): ");
        int num = sc.nextInt();

        int array[] = new int[num - 1];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = sc.nextInt();
        }

        int Sum = num * (num + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }

        int missing = Sum-actualSum;

        System.out.println("Missing Number is: " + missing);
    }
}