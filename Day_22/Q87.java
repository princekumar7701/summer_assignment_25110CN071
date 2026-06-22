//WAP to character frequecncy
import java.util.*;
public class Q87{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
String string =sc.nextLine();
System.out.println("The string contains:");
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int count = 0;

            for (int j = 0; j < string.length(); j++) {
                if (ch == string.charAt(j)) {
                    count++;
                }
            }

            boolean check= false;
            for (int k = 0; k < i; k++) {
                if (ch == string.charAt(k)) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                System.out.println(ch + " " + count+" times");
            }
        }
    }
}
    
