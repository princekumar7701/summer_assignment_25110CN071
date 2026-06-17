//WAP to find pair with given sum
import java.util.*;
public class Q63{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size =sc.nextInt();
        int array[]=new int[size];
        for(int  i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index: ");
            array[i]=sc.nextInt();

        }
        System.out.print("Enter the sum to find pairs: ");
        int sum =sc.nextInt();
        int found=0;
        for(int i=0;i<array.length;i++){
            for(int j =i;j<array.length;j++){
                if(array[i]+array[j]==sum){
                    found++;
                    System.out.println("Sum Pairs of element "+array[i]+" and element "+array[j]+ " is equals to sum "+sum);
                }
            }
        }
         if(found==0){
                    System.out.print("Pairs not found");
                }
    }
}