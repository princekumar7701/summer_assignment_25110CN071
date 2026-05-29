

//WAP to find sum of digits of a number

import java.util.*;
public class Q5 {   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();


int remainder =0;
int sum=0;

while(num>0){
remainder = num%10;
sum+=remainder;
num =num/10;

}
System.out.println("The sum of digits of the number : " +sum);




}
}