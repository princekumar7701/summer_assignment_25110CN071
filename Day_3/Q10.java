//WAP to print prime numbers in a range 


import java.util.*;

public class Q10{
public static void main (String args[]){

Scanner sc = new Scanner(System.in);
 System.out.print("Enter starting: ");
 int start =sc.nextInt();

 System.out.print("Enter ending: ");
 int end = sc.nextInt();


int i;
int j;

for(i=start;i<=end;i++){
   if(i<2)
     continue;
   int count=0;


for(j=2;j<=i/2;j++){
   if(i%j==0){
      count++;
      break;
   }
   
}
if(count==0){
      System.out.print(i + " ");
   }
}


}}