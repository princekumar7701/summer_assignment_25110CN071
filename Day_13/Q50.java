//WAp to  find sum and average of array
import java.util.*;
public class Q50{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    int number[]=new int[size];
    
    for(int i=0;i<number.length;i++){
        System.out.print("Enter element at "+i+" index: ");
        number[i] = sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<number.length;i++){
        sum+=number[i];
    }
    
    int average =sum/size;
    System.out.println("The sum of the array elments is: "+sum);

    System.out.print("The avergae of array is: "+average);

}
}