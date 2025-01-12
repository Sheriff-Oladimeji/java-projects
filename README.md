# Rock-Paper-Scissors Game - README Guide

## **Project Overview**
This is a simple Java-based console game where the user plays Rock-Paper-Scissors against the computer. The goal is to implement a working game that teaches you core Java concepts like conditionals, loops, random number generation, and user input handling.

---

## **Game Rules**
1. The player chooses either **Rock**, **Paper**, or **Scissors**.
2. The computer randomly chooses one of the three options.
3. The winner is decided based on the following rules:
   - **Rock beats Scissors**
   - **Scissors beats Paper**
   - **Paper beats Rock**
4. If both the player and computer choose the same option, the result is a **tie**.

---

## **Features**
1. **User Input**: The user will be prompted to enter their choice.
2. **Random Choice for Computer**: The computer’s choice is generated randomly.
3. **Result Display**: After each round, the game displays whether the user won, lost, or tied.
4. **Replay Option**: The user can choose to play another round or exit the game.

---

## **Learning Objectives**
By building this game, you will learn:
- How to take user input using the `Scanner` class.
- How to generate random numbers using the `Random` class.
- How to use conditionals (`if-else`, `switch`) to implement game logic.
- How to use loops to allow multiple rounds of the game.
- How to handle strings and compare them.

---

## **Implementation Steps**
### **Step 1: Setting Up the Project**
1. Create a new Java project in your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code).
2. Create a main class named `RockPaperScissors`.

### **Step 2: Import Required Classes**
You will need to import:
- `java.util.Scanner` for user input.
- `java.util.Random` for generating the computer’s choice.

### **Step 3: Implement Game Logic**
1. Prompt the user to enter their choice (Rock, Paper, or Scissors).
2. Generate a random choice for the computer (0 for Rock, 1 for Paper, 2 for Scissors).
3. Compare the user’s choice with the computer’s choice to determine the winner.
4. Display the result of the round (Win, Lose, or Tie).
5. Ask the user if they want to play again and loop accordingly.

### **Step 4: Edge Cases to Handle**
- Ensure the user input is valid (e.g., handle incorrect inputs like numbers or unsupported strings).
- Handle case sensitivity for user input (e.g., both `rock` and `Rock` should be valid).

---

## **Example Output**
```
Welcome to Rock-Paper-Scissors!
Enter your choice (Rock, Paper, or Scissors): Rock
Computer chose: Scissors
You win! Rock beats Scissors.

Do you want to play again? (yes/no): yes

Enter your choice (Rock, Paper, or Scissors): Paper
Computer chose: Rock
You win! Paper beats Rock.

Do you want to play again? (yes/no): no
Thanks for playing!
```

---

## **Possible Enhancements**
- **Score Tracking**: Keep track of the number of games won, lost, and tied.
- **Best of N Rounds**: Allow the user to play a series of rounds and display the overall winner.
- **GUI Version**: Create a graphical user interface version using Java Swing or JavaFX.

---

## **Conclusion**
This project is a great way to start learning Java. It introduces you to core concepts in a fun and interactive way. By completing it, you will have a solid foundation for more advanced Java projects.

Happy coding!

