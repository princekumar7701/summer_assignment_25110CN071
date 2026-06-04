//WAP to find nth fibonacci term


import java.util.*;
public class Q14{
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter number to find nth term: ");
int length=sc.nextInt();


int first_term =0;

int second_term =1;


for(int i=1; i<length;i++){
   
    int next_term=first_term+second_term;

    first_term=second_term;

    second_term=next_term;

    }
    System.out.print(first_term);
    
    
    }
    
    
    }