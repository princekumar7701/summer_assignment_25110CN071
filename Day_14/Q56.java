
//WAP to find duplicates in array
import java.util.*;
public class Q56{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        int array[]=new int[size];

        for(int i=0;i<array.length;i++){
            System.out.print("Enter the element at "+i+ "index: ");
            array[i]=sc.nextInt();

        }
        for(int j=0;j<array.length;j++){
            
            for(int k=j+1;k<array.length;k++){
                if(array[j]==array[k]){
                    System.out.println("The duplicate of element "+array[j]+" at index " +j+ " is found at "+k+" index");
                }
            }

    }
}

} 