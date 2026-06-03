// WAP to find LCM of two numbers
 
 import java.util.*;
 public class Q12{
    public static void main (String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1=sc.nextInt();

System.out.print("Enter second number: ");
int num2= sc.nextInt();

int gcd =1;
int i;

for(i=1;i<=num1 && i<=num2;i++){

if(num1%i==0 && num2%i==0){
gcd = i;
}
}

int lcm =(num1*num2)/gcd;


System.out.println("The LCM of the numbers is " +lcm);



    }
 }