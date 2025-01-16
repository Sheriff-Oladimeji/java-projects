import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        boolean playAgain = true;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to guess the number game");
        int score = 0;
        while (playAgain) {
            boolean isCorrect = false;
            int randomNumber = (int) (Math.random() * 101);

            while (!isCorrect) {
                System.out.println("Your score: " + score);
                System.out.println(randomNumber);
                System.out.println("Enter a number between 0 and 100");
                int userNumber = myScanner.nextInt();
                myScanner.nextLine();
                if (userNumber == randomNumber) {
                    System.out.println("Correct!");
                    isCorrect = true;
                    score += 1;

                }

                else if (userNumber < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            System.out.println("Do you want to play again? (yes/no): ");
            String isPlayAgain = myScanner.nextLine();
            playAgain = isPlayAgain.equalsIgnoreCase("yes");

        }
        System.err.println("Thanks for playing");
        myScanner.close();
    }
}