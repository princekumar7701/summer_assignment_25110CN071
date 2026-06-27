// WAP to create Quiz Application
import java.util.*;

public class Question_104 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Quiz Application");

      //  Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What is the capital of India?",
            "2. Which keyword is used to create an object in Java?",
            "3. Which method is the entry point of a Java program?",
            "4. Which package contains the Scanner class?",
            "5. Which data type stores whole numbers?"
        };

        String[][] options = {
            {"A. Mumbai", "B. Delhi", "C. Chennai", "D. Kolkata"},
            {"A. class", "B. new", "C. static", "D. object"},
            {"A. start()", "B. run()", "C. main()", "D. execute()"},
            {"A. java.io", "B. java.util", "C. java.lang", "D. java.net"},
            {"A. float", "B. double", "C. int", "D. char"}
        };

        char[] answers = {'B', 'B', 'C', 'B', 'C'};

        String[] correctAnswers = {
            "B. Delhi",
            "B. new",
            "C. main()",
            "B. java.util",
            "C. int"
        };

        int score = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");

            char useranswer = Character.toUpperCase(sc.next().charAt(0));

            if (useranswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + correctAnswers[i]);
            }
        }

        System.out.println("\n====================");
        System.out.println("Quiz Completed");
        System.out.println("Your Score: " + score + "/5");

        if (score == 5)
            System.out.println("Excellent!");
        else if (score >= 3)
            System.out.println("Good!");
        else
            System.out.println("Better Luck Next Time!");

        System.out.println("====================");

    
    }
}