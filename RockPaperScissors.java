import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.err.println("Welcome to Rock-Paper-Scissors! ");
        System.out.println("Enter your choice: rock, paper, or scissors: ");
        String userChoice = myScanner.nextLine();
       
        String[] choices = { "rock", "paper", "scissors" };
        int len = choices.length;
        int randomIndex = (int) (Math.random() * len);
        String computerChoice = choices[randomIndex];
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        if (userChoice.toLowerCase() == computerChoice.toLowerCase()) {
            System.out.println("It's a tie!");
        }
        else if (userChoice.toLowerCase() == "rock" && computerChoice.toLowerCase() == "scissors") {
            System.out.println("You win!");
        }
        else if (userChoice.toLowerCase() == "scissors" && computerChoice.toLowerCase() == "paper") {
            System.out.println("You win!");
        }
        else if (userChoice.toLowerCase() == "paper" && computerChoice.toLowerCase() == "rock") {
            System.out.println("You win!");
        }
        else {
            System.out.println("Computer wins!");

        }
      
        myScanner.close();

    }
}