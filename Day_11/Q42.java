//WAP to write function to find maximum
import java.util.*;
public class Q42{
    public static int maximum(int num1 ,int num2){
        if(num1>num2){
            return num1;
        }else 
        return num2;
    }
public static void main (String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int num1=sc.nextInt();
System.out.print("Enter seconf number: ");
int num2=sc.nextInt();

System.out.print("The maximum out of two entered numbers is: "+maximum(num1,num2));
}
}