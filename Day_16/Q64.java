//WAP to remove duplicates from the array
import java.util.*;
public class Q64 {
     public static void main(String args[]) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of array : ");
            int size = sc.nextInt();
           int array[] = new int[size];
           for(int i=0;i<array.length;i++)
            {
                System.out.print("Enter element at "+i+" index: ");
                array[i] = sc.nextInt();
            } 
            System.out.println("New Array is : ");
            for(int i=0;i<array.length;i++) 
                {
             int count = 0;
            for(int j=0;j<i;j++) 
                {
                if(array[i] == array[j]) 
                {
                    count++;
                    break;
                }
            }
            if(count == 0) 
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}