//WAP to write function to find factorial
import java.util.*;
public class Q44{
    public static int fact(int num){
        int factorial=1;
        
        if(num==1||num==0){
            return 1;
        }else
        
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();
System.out.println("The factorial of "+num+" is "+fact(num));

    }
}