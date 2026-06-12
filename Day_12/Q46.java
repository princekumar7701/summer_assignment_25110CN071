//WAP to write function for armstrong
import java.util.*;
public class Q46{
    public static void armstrong(int num){
        int copy=num;
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        num=copy;
        int sum=0;
        while(num>0){
            int reminder=num%10;
            sum=sum+(int)Math.pow(reminder,count);
             num/=10;
        }
        if(sum==copy){
            System.out.println(copy+" is armstrong number");
        }else
        System.out.println(copy+" is not armstrong number");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
       armstrong(num);
    
    }
}