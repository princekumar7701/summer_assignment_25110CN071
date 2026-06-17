//WAP to find maximum frequency element
import java.util.*;
public class Q62{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ente the size of the array: ");
        int size=sc.nextInt();

int array[]=new int[size];

        for (int i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index: ");
            array[i]=sc.nextInt();

        }
        int element=0;
        
        int maxfrequency=Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){

int count=0;
for(int j=0;j<array.length;j++){
    if(array[i]==array[j]){
        count++;
    }
    if(maxfrequency<count){
        maxfrequency=count;
        element=array[i];
    }
}
//System.out.print(element,maxfrequency);
        }
        System.out.print("Element= "+element+" has maxfrequency="+maxfrequency);

    }
}