//WAP to count even and odd elments
import java.util.*;
public class Q52{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter element at "+i+" index: ");
            array[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The number of even elements in array is: "+even);
        System.out.println("The number of odd elements in array is: "+odd);
    }
}