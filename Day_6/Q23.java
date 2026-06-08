//  WAp to count set bits in number
import java.util.*;
public class Q23{
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter a binary number :");
int num =sc.nextInt();
int count=0;
while(num>0){
    int reminder=0;
    reminder=num%2;
    if(reminder>0){
        count++;
    }
    num/=10;
}
System.out.println("The nunmber of set bits are "+ count);


    }
}