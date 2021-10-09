import java.util.Random;
import java.util.Scanner;  
public class Random
{
    static void guessrandomnumber()
    {
        int answer, guess;
        final int MAX = 10;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer = rand.nextInt(MAX) + 1;
        while (!correct) 
        {
            System.out.println("Guess a number between 1 and 10: ");
            guess = in.nextInt();
            if (guess > answer)
            {
                System.out.println("Too high, try again");
            }
            else if (guess < answer)
            {
                System.out.println("Too low, try again");
            }
            else
            {
                System.out.println("Yes, you guessed the number= "+guess);
                correct = true;
            }
        }
        System.exit(0);
    }
    public static void main(String[] args)
    {
        guessrandomnumber();
        
    }
}