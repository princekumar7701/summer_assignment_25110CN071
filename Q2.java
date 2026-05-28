// WAPTo print multiplication table of a given number


import java.util.*;

public class Q2 {   
 public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        System.out.println("The multiplication table of the given number is: ");

        for(int i=1; i<=10; i++){
             System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}