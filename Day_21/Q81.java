 //WAP to find String length without using strlen()
 import java.util.*;
 public class Q81{
  public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.print("Enter  the string : ");
        string = sc.nextLine();
        int count =0;
        int i=0;
       char ch = ' '; 
       while(true)
       {
        try
        {
        ch = string.charAt(i);
        count++;
        i++;
       }
       catch (StringIndexOutOfBoundsException e)
            {
                break; 
            }
      }

 System.out.println("Length of the string is "+count);
    }
}