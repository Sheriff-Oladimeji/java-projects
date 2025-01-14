import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (playAgain) {
            System.out.println("Enter your choice: rock, paper, or scissors: ");
            String userChoice = myScanner.nextLine();

            
            while (!userChoice.equalsIgnoreCase("rock") &&
                    !userChoice.equalsIgnoreCase("paper") &&
                    !userChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors: ");
                userChoice = myScanner.nextLine();
            }

            
            String[] choices = { "rock", "paper", "scissors" };
            int randomIndex = (int) (Math.random() * choices.length);
            String computerChoice = choices[randomIndex];

            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

           
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors") ||
                    userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper") ||
                    userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (yes/no): ");
            String isPlayAgain = myScanner.nextLine();
            playAgain = isPlayAgain.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        myScanner.close();
    }
}
