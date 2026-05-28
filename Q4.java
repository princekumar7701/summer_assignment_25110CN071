//WAp to count digits in a number

import java.util.*;
public class Q4 {   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("The number of digits in the given number is: "  +count);
    }
}
