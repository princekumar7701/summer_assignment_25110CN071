// WAP to find largest prime factor

import java.util.*;
public class Q20{
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num =sc.nextInt();

 int largestprimefactor=1;
 for (int i=2;i<=num;i++){
   if (num%i==0){
      int count =0;
      for (int j=2;j<=i/2;j++){

         if(i%j==0){
            count++;
            break;
         }
      }
      if (count==0){
         largestprimefactor =i;
      }
   }
   
 }
System.out.println("The largest prime factor is "+largestprimefactor );


    }
    
    }