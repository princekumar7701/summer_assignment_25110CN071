//WAP to find product of digits of a number
 import java.util.*;
 public class Q7{
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a number: ");

int num = sc.nextInt();
int remainder =0;
int product=1;

while(num>0){
remainder= num%10;
product*=remainder;
num =num/10;
}

System.out.println("The product of digits of the number:" +product);

    }
 }
