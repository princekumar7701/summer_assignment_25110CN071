//WAP to  second largest element

import java.util.*;
public class Q55{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size =sc.nextInt();

        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index: ");
            array[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<array.length;j++){
            if(largest<array[j]){
                largest=array[j];
            }
        }
        System.out.println("The largest elment in the array is "+largest);

int second_largest=Integer.MIN_VALUE;
        for(int k=0;k<array.length;k++){
            if(second_largest<array[k]&&array[k]<largest){
                second_largest=array[k];
            }
        }
        System.out.println("The second largest element is "+second_largest);
    }
}