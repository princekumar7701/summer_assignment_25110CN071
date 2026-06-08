//WAP to convert decimal to binary number

import java.util.*;
public class Q21{
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int num= sc.nextInt();
int copy=num;
int binary=0;
int pow=0;
while(num>0){
    int reminder=num%2;
    binary= binary+ (reminder*(int)Math.pow(10,pow));
    pow++;
    num/=2;
    
}
System.out.println(copy +" in binary number is equals to "+binary);

    }
    
}