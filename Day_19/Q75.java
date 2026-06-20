//WAP to transpose matrix
import java.util.*;
public class Q75{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        
        System.out.print("Enter matrix elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
System.out.println("The entered matrix is:");
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
}

        System.out.println("The transpose of the matrix is :");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}