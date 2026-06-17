//WAP to merge arrays
import java.util.*;
public class Q65{
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
    System.out.print("Enter elment at"+i+" index: ");
    array_2[i]=sc.nextInt();
}        
int merged[]=new int[array.length+array_2.length];
for(int i=0 ;i<array.length;i++){
    merged[i]=array[i];
}
for(int i=0;i<array_2.length;i++){
    merged[array.length+i]=array_2[i];
}
System.out.println("The merged array is ");
for(int i=0;i<merged.length;i++){
    System.out.print(merged[i]+" ");
}



}




}