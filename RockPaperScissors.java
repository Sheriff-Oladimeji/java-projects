import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.err.println("Welcome to Rock-Paper-Scissors! ");
        System.out.println("Enter your choice: rock, paper, or scissors: ");
        String userChoice = myScanner.nextLine();
while (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
        System.out.println("Invalid choice. Please enter rock, paper, or scissors: ");
        userChoice = myScanner.nextLine();
    
}
        String[] choices = { "rock", "paper", "scissors" };
        int len = choices.length;
        int randomIndex = (int) (Math.random() * len);
        String computerChoice = choices[randomIndex];
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        if (userChoice.equalsIgnoreCase(computerChoice)) {
        System.out.println("It's a tie!");
        }
        else if (userChoice.equalsIgnoreCase("rock") &&  computerChoice.equalsIgnoreCase("scissors")) {
        System.out.println("You win!");
        }
        else if (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
        System.out.println("You win!");
        }
        else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
        System.out.println("You win!");
        }
        else {
        System.out.println("Computer wins!");

        }
    
        myScanner.close();

    }
}