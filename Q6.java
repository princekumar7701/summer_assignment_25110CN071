//WAP to reverse a number


import java.util.*;
public class Q6{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number:");
int num = sc.nextInt();

int remainder=0;
int reverse =0;

while(num>0){

remainder = num%10;
reverse =reverse*10+remainder;
num=num/10;

}
System.out.println("The reverse of the number: " +reverse);

}

}