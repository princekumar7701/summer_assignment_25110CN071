//WAP to subtract matrices
import java.util.*;
public class Q74{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=sc.nextInt();
System.out.print("Enter the number of columns: ");
int col=sc.nextInt();
int  matrix[][]=new int[row][col];
int matrix_2[][]=new int[row][col];
System.out.println("Enter  the first matrix elements:");
for(int i=0;i<row;i++){
 for(int j=0;j<col;j++){
    matrix[i][j]=sc.nextInt();
 }
}
System.out.println("Enter the second matrix elements:");
for(int i=0;i<row;i++){
 for(int j=0;j<col;j++){
    matrix_2[i][j]=sc.nextInt();
 }
}
int sub[][]=new int[row][col];
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        sub[i][j] = matrix[i][j] - matrix_2[i][j];
    }
}
System.out.println("The subtraction of the matrices is ");
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
        System.out.print(sub[i][j]+" ");
    }
    System.out.println();
}
    }
}

