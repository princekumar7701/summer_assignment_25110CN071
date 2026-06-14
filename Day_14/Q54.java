//WAP to frequency of an element
import java.util.*;
public class Q54{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int array[]=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index:");
            array[i]=sc.nextInt();

        }
        //int count;
        for(int i=0;i<array.length;i++){
            int temp=array[i];
           int count=0;
           
            for(int j=0;j<array.length;j++){
                if(temp==array[j]){
                    count++;
                }
                
                }
                System.out.println("The array element "+array[i]+" is found "+count+" times");

        
        }
        

    }
    
}
