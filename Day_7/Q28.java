//WAP to  recursive reverse number
import java.util.Scanner;

public class Q28 {

  public  static void reverse(int num) {
        if (num == 0) {
            return;
        }

        System.out.print(num % 10);
        reverse(num / 10);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Reverse = ");
        reverse(num);
    }
}