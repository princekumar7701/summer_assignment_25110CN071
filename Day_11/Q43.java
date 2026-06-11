//WAP to write function to check prime
import java.util.*;
public class Q43{

public static void prime(int num){
    if(num==0||num==1){
         System.out.print(num+" is not prime");
    }else{
        int count=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
             System.out.print(num+" is prime number");
        }else
         System.out.print(num+" is not prime number");
    }
}

    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();
prime(num);
    }
}