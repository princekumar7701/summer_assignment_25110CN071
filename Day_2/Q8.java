//WAP to check whether a nuymber is palindrome of not

import java.util.*;
public class Q8 {
public static void main(String agrs[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: " );
 int num1 = sc.nextInt();
 int num2 =num1;

 int remainder =0;
 int reverse =0;
 while(num1>0)
 {
remainder=num1%10;
reverse= reverse*10+remainder;
num1/=10;

 }

if(num2==reverse)
{System.out.println("The number is palindrome:");
}


else{
    System.out.println("The number is not palindrome:" );
}






}

}

