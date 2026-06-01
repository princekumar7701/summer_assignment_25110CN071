// WAP to find the sum of N natural numbers


import java.util.*;

public class Q1 {   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("The sum of first N natural numbers is: "  +sum);
    }
}
