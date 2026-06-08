//WAP to find X^n without pow()

import java.util.*;

public class Q24{
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();
System.out.print("Enter power of the entered number: ");
int pow=sc.nextInt();
int num2=num;
for(int i=1;i<pow;i++){
    num=num*num2;
}
System.out.println("The value of "+num2+" to the power " +pow+" is: "+num);

    }
}