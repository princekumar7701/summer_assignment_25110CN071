//WAP to create number guessing game
import java.util.*;
public class Q101 {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int num =0;
        int count =0;
         while(num!=number)
        {
        System.out.print("Guess the number : ");
        num = sc.nextInt();
        count++;
        if(num>number)
        {
            System.out.println("OOPS!! you guessed it too high ");
        }
        else if(num<number)
        {
            System.out.println("OOPS!! you guessed it too low ");
        }
        else
        {
            System.out.println("YAY!! you guessed it correctly in "+count+" attempts");
        }
        }
}
}