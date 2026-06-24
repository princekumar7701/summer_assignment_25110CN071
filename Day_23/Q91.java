//WAP to check anagram strings
import java.util.*;
public class Q91{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String string=sc.nextLine();
        System.out.print("Enter second string: ");
        String string_2=sc.nextLine();
        
         char[] a = string.toCharArray();
        char[] b = string_2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)) 
        {
            System.out.println("Anagram Strings");
        }
         else
        {
            System.out.println("Not Anagram Strings");
        }
    }
}