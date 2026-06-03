//WAP to find GCD of two numbers

import java.util.*;
public class Q11{
public static void main(String args[]){

Scanner sc =new Scanner(System.in);


System.out.print("Enter first  number : ");
int num1=sc.nextInt();

System.out.print("Enter second number : ");
int num2= sc.nextInt();

int gcd =1;
int i;

for(i=1;i<=num1 && i<=num2;i++){

if(num1%i==0 && num2%i==0){
gcd = i;
}
}


System.out.println("The GCD of the numbers is :"+gcd);





}

}
