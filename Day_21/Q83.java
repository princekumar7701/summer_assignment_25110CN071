//WAP to count vowels and consonants
import java.util.*;
public class Q83{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String string=sc.nextLine();
       
        int vowel=0;

        int consonant=0;
        char ch;
for(int i=0;i<string.length();i++){
ch=string.charAt(i);
if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
    vowel++;

}
else if(ch!=' '){
    consonant++;
}
}
System.out.println("The number of vowels in the string is: "+vowel);
System.out.println("The number of consonants in the strinf is: "+consonant);



    }
}