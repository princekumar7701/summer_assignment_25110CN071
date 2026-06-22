//WAP to reverse a string
import java.util.*;
public class Q82{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String string;
        System.out.print("Enter string: ");
        string=sc.nextLine();
        System.out.print("The reverse of the entered string: ");
    for (int i = string.length() - 1; i >= 0; i--) {
          
            char ch = string.charAt(i);
            System.out.print(ch);

    }
}
}