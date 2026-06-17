//WAP to find common elements

import java.util.*;
public class Q68{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size=sc.nextInt();
             int array[]= new int[size];
            // System.out.println(array.length);
            System.out.println("Enter first array elements ");
for(int i=0;i<array.length;i++){
    System.out.print("Enter elment at "+i+" index: ");
   array[i]=sc.nextInt();
}
System.out.print("Enter the size of the second array: ");
int length=sc.nextInt();
        int array_2[]= new int [length];
        System.out.println("Enter Second array elements");
for(int i=0;i<array_2.length;i++){
    System.out.print("Enter elment at "+i+" index: ");
    array_2[i]=sc.nextInt();
}        
System.out.println("Commom elemets of arrays are");
for(int i=0;i<array.length;i++){
    for( int j=0;j<array_2.length;j++){
        if(array[i]==array_2[j]){
            System.out.print(array[i]);
            break;
        }
    }
}

    }
    }