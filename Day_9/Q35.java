//WAP to print repeated character pattern

import java.util.*;
public class Q35{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Enter a number: ");
int num =sc.nextInt();

char ch='A';
for (int i=1;i<=num;i++){
    for(int j=1;j<=i;j++){
        System.out.print(ch);
    }
    System.out.println();
    ch++;
}

    }
}