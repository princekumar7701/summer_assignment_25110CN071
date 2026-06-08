//WAP to convert binary to decimal
import java.util.*;
public class Q22{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num= sc.nextInt();
  
  int pow =0;
  int copy=num;
  int decimal=0;
  while(num>0){
    int reminder=num%10;
    decimal=decimal+(reminder*(int)Math.pow(2,pow));
    pow++;
    num/=10;
  }
System.out.print(copy+" in decimal number is equals to "+decimal);

    }
}