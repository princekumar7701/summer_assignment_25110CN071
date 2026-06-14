//WAP to linear search
import java.util.*;
public class  Q53{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size =sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter array element at "+i+" index: ");
            array[i]=sc.nextInt();
        }
System.out.print("Enter the element to be search: ");
int key =sc.nextInt();
int found=0;

for(int i=0;i<array.length;i++){
    if(array[i]==key){
        System.out.println("The element "+key+" is found at "+i+" index of the array");
           found++; 
}
}
if(found==0){
    System.out.print("Element "+key+" is not found");
}
}
    
}
