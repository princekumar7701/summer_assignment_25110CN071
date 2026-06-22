//WAP to remove spaces from string
import java.util.*;
public class Q88{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String: ");
    String string=sc.nextLine();
    String without_space="";
    for(int i=0; i<string.length(); i++){
        char ch=string.charAt(i);
        if(ch!=' '){
            without_space+=ch;
        }
    }
    System.out.print("The entered string after removing spaces is: "+without_space);
}
}