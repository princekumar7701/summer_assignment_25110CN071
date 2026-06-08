//WAP to print half pyramid pattern

import java.util.*;
 public class Q29{
    public static void main(String arg[]){
Scanner sc =new Scanner(System.in);

System.out.print("Enter a number: ");
int num=sc.nextInt();
for(int i =1; i<=num;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}


    }
 }