//WAP to biinary search
import java.util.*;
public class Q71{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size =sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter a sorted array");
        for(int i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index :");
            array[i]=sc.nextInt();
        }
System.out.print("Enter the element to be search:");
int key=sc.nextInt();
int start=0;
int end=array.length-1;
while(start<=end){
    int mid =(start+end)/2;
    if(array[mid]==key){
        System.out.print("The element "+key+" is found at "+mid+" index of the array");
    }
    if(key>array[mid]){
        start=mid+1;
    }else{
        end=mid-1;
    }
}

    }
}