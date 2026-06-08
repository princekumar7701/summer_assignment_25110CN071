//WAP to print factors of a number

import java.util.*;
public class Q19{
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num =sc.nextInt();
System.out.print("The factors are :");
for(int i =1; i<=num/2;i++){
  if(num%i==0){
    System.out.print(i+" ");
  }
}
   }
        
    }