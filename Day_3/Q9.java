//WAp to check whether a number is a number is prime or not

import java.util.*;
public class Q9{
    public static void main(String args[]){
 
 Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");

int num = sc.nextInt();


int count=0;
if(num==1||num==0){
    System.out.print("Number is not prime: ");
 
}


else {
for(int i=2;i<num;i++){
    if(num%i==0){
        count++;
    }
}
if (count==0){
    System.out.println("Number is prime: ");

}
else{
    System.out.println("Number is not prime: ");

}
    
}


    }
}