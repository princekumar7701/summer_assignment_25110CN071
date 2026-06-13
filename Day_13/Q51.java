//WAP to find largest and smallest element
import java.util.*;
public class Q51{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

System.out.print("Enter the size of the array: ");
int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter elemets at " +i+  " index: ");
            array[i]=sc.nextInt();
              
        }
        int largest=Integer.MIN_VALUE;
       // int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
            }

             int smallest=Integer.MAX_VALUE;

for(int i=0;i<array.length;i++){
    if(smallest>array[i]){
        smallest=array[i];
    }
}


        
        System.out.println("The largest element in the array is: "+largest);
        System.out.println("The smallest element in the array is: "+smallest);
    }
}