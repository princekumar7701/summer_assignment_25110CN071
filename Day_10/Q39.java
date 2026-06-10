// WAP to print number pyramid

import java.util.*;
public class Q39{
    public static void main (String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num=sc.nextInt();

for(int i=1;i<=num;i++){
    for(int j=1;j<num-i+1;j++){
        System.out.print(" ");
    }
    for(int j=1 ;j<=i;j++){
        System.out.print(j);
    }
    for(int l=i-1;l>=1;l--){
        System.out.print(l);
    }
    System.out.println();
}



    }
}