//WAP to convert lowercase to uppercase
import java.util.*;
public class Q84{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String string=sc.nextLine();
          for(int i=0;i<string.length();i++)
        {
            char ch = string.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                ch = (char)(ch - 32);
                System.out.print(ch);
            }
            else
                {
                    System.out.print(ch);
                }
        }
    }
}