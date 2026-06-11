//WAP to write function to find sum of two numbers
import java.util.*;
public class Q41{
    public static int sum(int num1,int num2){
int sum=num1+num2;
return sum;

    }

    public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int num1=sc.nextInt();

System.out.print("Enter second number: ");
int num2=sc.nextInt();

System.out.println("The  sum of two numbers is :"+sum(num1,num2));

    }
}