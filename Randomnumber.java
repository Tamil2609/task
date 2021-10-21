import java.io.*;
import java.lang.*;
import java.util.*;
public class Randomnumber extends Fileconcepts
{
     public static void main(String[] args)
    {
        int answer, guess;
        final int MAX = 10;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Fileconcepts file=new Fileconcepts();
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
                file.FileCreate() ;
                file.FileWriter(guess);
                file.FileReader();
            }
        }
        System.exit(0);
    }
   
    
}