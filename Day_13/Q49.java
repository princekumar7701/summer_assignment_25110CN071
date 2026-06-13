// Write a program to input and display array

import java.util.*;
public class Q49{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    int number[]=new int[size];
    
    for(int i=0;i<number.length;i++){
        System.out.print("Enter element at "+i+" index: ");
        number[i] = sc.nextInt();
    }
    System.out.println("Entered array elements are");
    for(int i=0;i<number.length;i++){
      System.out.print(number[i]+ " ");

    }

}
}