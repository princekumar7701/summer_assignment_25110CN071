//WAP to rotate an array right 
import java.util.*;
public class Q59{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
int number[]=new int[size];
for(int i=0;i<number.length;i++){
    System.out.print("Enter element at "+i+" index: " );
 number[i]=sc.nextInt();
}

System.out.print("Enter times of rotation: ");
int rotate=sc.nextInt();
for(int i=0;i<rotate;i++){
    int temp=number[size-1];

    for( int  j=size-1;j>0;j--){
    
    number[j]=number[j-1];
    }
    number[0]=temp;
}


for(int k=0;k<number.length;k++){
    System.out.print(number[k]);
}

    }
}