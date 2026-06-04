//WAP to print Armstrong numbers in a range

import java.util.*;
public class Q16 {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter starting: ");
int start=sc.nextInt();

System.out.print("Enter Ending: ");
int end = sc.nextInt();


System.out.println("The Armstrong numbers are ");

for(int i=start;i<=end;i++){
//copy =i;
int temp=i;
int copy=i;
int sum=0;
int count=0;

 while(temp>0){
    count++;
 temp=temp/10;
 }

temp=copy;

while(temp>0){
 int reminder =0;
    reminder =temp%10;
    sum=sum +(int)Math.pow(reminder,count);
   temp= temp/10;
}

if(sum==copy){
    System.out.print(copy +" ");
}
}



    }
}