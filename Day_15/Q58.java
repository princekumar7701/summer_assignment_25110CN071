//WAP to rotate array left
import java.util.*;
public class Q58{
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
    int temp=number[0];

    for( int  j=0;j<number.length-1;j++){
    
    number[j]=number[j+1];
    }
    number[size-1]=temp;
}


for(int k=0;k<number.length;k++){
    System.out.print(number[k]);
}

    }
}