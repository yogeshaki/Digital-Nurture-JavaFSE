import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = random.nextInt(100)+1;
        int guess;

       

        do {
            System.out.print("Enter a number between 1 and 100: " );
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! You guessed correctly.");
            }

        } while (guess != secretNumber);

        sc.close();
    }
}