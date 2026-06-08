// WAP to check strong number
import java.util.*;
public class Q18{
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num =sc.nextInt();
 int sum =0;
 int copy =num;
 while(num>0){
   int reminder =0;
   int fact=1;
   reminder=num%10;
   for(int i=1;i<=reminder;i++){
      fact*=i;
   }
   sum+=fact;
   num/=10;
 }
 if(copy==sum){
   System.out.println(copy+" "+"is strong number");
 }
 else 
 System.out.println(copy+" "+"is not strong number");



    }
    }