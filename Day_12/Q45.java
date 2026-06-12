//WAp to write function for palindrome
import java.util.*;
public class Q45{ 
    public static void palindrome(int num){
        int copy=num;
        int reverse=0;
        while(num>0){
            int reminder=num%10;
            reverse=reverse*10+reminder;
            num/=10;
        }
        if(reverse==copy){
            System.out.println(copy+" is palindrome number");
        }else
        System.out.println(copy+" is not palindrome number");
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        palindrome(num);

    }
}