//WAP to check Armstrong number

import java.util.*;
public class Q15{
    public static void main(String args[]){
Scanner sc =  new Scanner(System.in);


System.out.print("Enter a number:");
int num=sc.nextInt();


int copy=num;
int count=0;
while(num>0){
count++;
num =num/10;
}

num=copy;
int sum=0;

while(num>0){
    int reminder=0;
    reminder=num%10;
    sum= sum+(int)Math.pow(reminder,count);
    num=num/10;
    


}

if(sum==copy){
    System.out.println("Number is Armstrong  number");
}
else
System.out.println("Number in not Armstrong number");







    }
}