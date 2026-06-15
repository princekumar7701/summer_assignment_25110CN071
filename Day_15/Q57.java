//WAP to reverse an array
import java.util.*;

public class Q57{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        int array[] = new int[size];

        for(int i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index: ");
            array[i]=sc.nextInt();
        }
        int first =0;
        int last =array.length-1;
        while(first<last){
int temp=array[last];
array[last]=array[first];
array[first]=temp;
        
        first++;
        last--;
        }
        System.out.print("The reverse of the entered array is: ");
        for(int j =0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
    }
}