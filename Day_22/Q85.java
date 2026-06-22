//WAP to check palindrome string
import java.util.*;
public class Q85{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sring: ");
        String string =sc.nextLine();
 String reverse ="";
        for (int i = string.length() - 1; i >= 0; i--){
reverse+=string.charAt(i);
        }
        if(reverse.equals(string)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
