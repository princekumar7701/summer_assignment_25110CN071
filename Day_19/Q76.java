//WAP to find diagonal sum
import java.util.*;
public class Q76{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size =sc.nextInt();
        
        
        int matrix[][]=new int[size][size];
        System.out.println("Enter matrix elements: ");
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            for(int j=0 ;j<size;j++){
                if(i==j||i+j==size-1){
                    sum+=matrix[i][j];
                }
                  
            }
        }
        System.out.print("The sum of diagonal elments of the matrix "+sum);

            
  }
}