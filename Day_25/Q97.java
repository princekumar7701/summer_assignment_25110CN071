//WAP to merge two sorted array
import java.util.*;

public class Q97 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the   size of the  firrst array: ");
        int size=sc.nextInt();
        int array[]=new int [size];
        
System.out.println("Enter first array sorted elements: ");

for(int i =0;i<array.length;i++){
    System.out.print("Enter element at "+i+" index: ");
    array[i]=sc.nextInt();
}
System.out.print("Enter the size of the second array: ");
        int size_2 =sc.nextInt();
int array_2[]=new int[size_2];
System.out.println("Enter second array soretd elements: ");
for(int i=0;i<array_2.length;i++){
    System.out.print("Enter element at "+i+" index: ");
    array_2[i]=sc.nextInt();
}

        int merged[] = new int[array.length + array_2.length];

        int i = 0, j = 0, k = 0;

        while (i < array.length && j < array_2.length) {
            if (array[i] < array_2[j]) {
                merged[k++] = array[i++];
            } else {
                merged[k++] = array_2[j++];
            }
        }

        while (i < array.length) {
            merged[k++] = array[i++];
        }

        while (j < array_2.length) {
            merged[k++] = array_2[j++];
        }

       
        System.out.println("Merged Array is:");
        for (i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}