//WAP to print reverse pyramid
import java.util.*;
public class Q38{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num =sc.nextInt();

        for(int i=num;i>=1;i--){
            for(int j=1;j<num-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}