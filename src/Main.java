import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int val = generator.nextInt(10) + 1;   //val is 1 to 10
        int guess = 1;
        int comp;

        System.out.print("Guess a number between 1-10: ");
        if(in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();

            if(guess >= 1 && guess <= 10)
            {
                System.out.println("You guessed: " + guess);
                if (guess > val)
                {
                    System.out.println("PC: your guess is too high!");
                }
                else if (guess < val)
                {
                    System.out.println("PC: your guess is too low!");
                }
                else if (guess == val)
                {
                    System.out.println("PC: You are correct! You Win!");
                }
                else
                {
                    return;
                }
            }
            else
            {
                System.out.println("That is not a number between 1 and 10");
            }
        }
        else
        {
            System.out.println("That is not a correct input, Try again!");
        }

    }
}