//WAP to selection sort
import java.util.*;
public class Q70{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        
        int array[] = new int[size];
        for(int i =0;i<array.length;i++)
        {
        System.out.print("Enter element at "+i+" index: ");
        array[i] = sc.nextInt();
        }
        for(int i =0;i<array.length-1;i++)
        {
            int min =i;
            for(int j = i+1;j<array.length;j++)
            {
                if(array[j]<array[min])
                {
                    min =j;
                }
            }
            if(min !=i)
            {
                int t = array[i];
                array[i] = array[min];
                array[min] = t;
            }
        }
        System.out.println("The sorted array is : ");
        for(int i =0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
}
}