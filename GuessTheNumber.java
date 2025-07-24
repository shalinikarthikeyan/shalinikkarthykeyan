import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int target=random.nextInt(100)+1;
        int guess=0;
        int attempt=0;
        System.out.println("Welcome to the Number Guessing Game");
        while(guess!=target)
        {
            System.out.println("Enter the Guessing Number");
            guess=sc.nextInt();
            if(guess>target)
            {
                System.out.println("your guess number is Too High");
            }
            else if(guess<target)
            {
                System.out.println("your guess number is Too Low");
            }
            else if(guess==target)
            {
                System.out.println("Congradulation you won the Game");
            }
        }

    }
}
