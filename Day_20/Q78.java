//WAP to check symmetric matrix
import java.util.*;
public class Q78{
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the row of matrix : ");
           int row = sc.nextInt(); 
           System.out.print("Enter the column of matrix : ");
           int cols = sc.nextInt();
           if(row==cols)
           {
           int matrix[][] = new int[row][cols];
           System.out.println("Enter matrix elements:");
           for(int i =0;i<row;i++)
            {
            for(int j =0;j<cols;j++)
            {
            matrix[i][j] = sc.nextInt();
           }
           }
           int count =0;
          for(int i =0;i<cols;i++)
            {
            for(int j =0;j<row;j++)
            {
              if(matrix[i][j] != matrix[j][i]) 
              {
                count++;
                break;
              }
            }
            }
            if(count>0)
            {
               System.out.println("Matrix is not a symmetric matrix");
            }
            else
            {
               System.out.println("Matrix is a symmetric matrix"); 
            }
           }
        else
        System.out.println("Matrix is not a square matrix");
        }
}
   