//WAp to write function for fibonacci
import java.util.*;
public class Q47{

public static void fibonacci(int num){
    int first_term=0;
    int second_term=1;
    for(int i =1;i<=num;i++){
        System.out.print(first_term+" ");
    int next_term=first_term+second_term;
    first_term=second_term;
    second_term=next_term;
    }
}

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Enter the length of the fibonacci series: ");
int num=sc.nextInt();
fibonacci(num);

}
}