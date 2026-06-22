//WAP to count words in a sentence
import java.util.*;
public class Q86{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String string=sc.nextLine();
        int count =1;
        for(int i=0 ; i<string.length(); i++){
           char ch=string.charAt(i);
            if(ch==' '||ch=='.'){
                count++;
            }

        }
        System.out.print(count);
    }
}