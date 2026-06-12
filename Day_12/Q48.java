//WAP to write function for perfect number
import java.util.*;
public class Q48{
    public static void perfect_num(int num){       
        int sum=0;
        for(int i=1;i<=num/2;i++){
if(num%i==0){
    sum+=i;
}

        }
        if(sum==num){
            System.out.println(num+" is perfect number");
        }else 
        System.out.println(num+" is not perfect number");
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    perfect_num(num);

}
}