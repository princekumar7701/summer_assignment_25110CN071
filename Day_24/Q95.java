//WAP to find longest word
import java.util.*;
public class Q95 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
       String string = sc.nextLine();
        String word = "";
        String longestWord = "";
        for(int i=0;i<string.length();i++)
        {
            char ch = string.charAt(i);
            if(ch!= ' ')
            {
                word =word+ch;  
            } 
            else 
                {
                if(word.length()>longestWord.length()) 
                {
                    longestWord=word;
                }
                word = "";   
                }
         }
            if (word.length()>longestWord.length()) 
            {
            longestWord =word;
            }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}