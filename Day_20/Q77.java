//WAP to multiply two matrices
import java.util.*;
public class Q77{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
System.out.print("Enter number of rows of first matrix: ");
int rows =sc.nextInt();
System.out.print("Enter number of columns of first matrix: ");
int cols=sc.nextInt();
int matrix[][]=new int[rows][cols];
System.out.print("Enter number of rows of second natrix: ");
int rows_2=sc.nextInt();
System.out.print("Enter number of columns of second matrix: ");
int cols_2=sc.nextInt();
int matrix_2[][]=new int[rows_2][cols_2];
System.out.println("Enter elements of first matrix:");
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
 
    matrix[i][j]=sc.nextInt();
    }
}
System.out.println("Enter elements of second matric: ");
for(int i=0;i<rows_2;i++){
    for(int j=0;j<cols_2;j++){
matrix_2[i][j]=sc.nextInt();
    }
}

int multiply[][]=new int[rows][cols_2];
for(int i=0;i<rows;i++)
           {
            for(int j=0;j<cols_2;j++)
            { 
                 multiply[i][j] = 0;
                for(int k=0;k<cols;k++)
                {
                    multiply[i][j] = multiply[i][j] + (matrix[i][k]*matrix_2[k][j]);
                }
            }
           }
           System.out.println("The multiplication of matrix is :");
           for(int i=0;i<rows;i++){
            for (int j=0 ;j<cols_2;j++){
                System.out.print(multiply[i][j]+ " ");
            }
            System.out.println();
           }



    }
}