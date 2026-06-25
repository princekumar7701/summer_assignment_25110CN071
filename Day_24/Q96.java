//WAP to  remove duplicates character
import java.util.*;
public class Q96 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = sc.nextLine();
        String string_2 ="";
         for(int i=0;i<string.length();i++)
        {
            int count =0;
            char ch = string.charAt(i);
            for(int j=0;j<i;j++)
            {
                char ch1 = string.charAt(j);
                if(ch==ch1)
                {
                count++;
                break;
                }
            }
            if(count==0)
            {
                string_2 = string_2 +ch;
            }
        }
        System.out.println("The new string is : "+string_2);
    }
}