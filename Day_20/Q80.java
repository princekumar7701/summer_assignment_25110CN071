//WAP to find column wise sum
import java.util.*;
public class Q80{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbre of rows of the matrix: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns of the matrxi: ");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        System.out.println("Enter matrix elements: ");
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        matrix[i][j]=sc.nextInt();
    }
}    
for(int i=0;i<cols;i++){
    int sum=0;
    for(int j=0;j<rows;j++){
        sum+=matrix[j][i];
    }
    System.out.println("The sum of "+(i+1)+" columns is "+sum);
}

    }
}