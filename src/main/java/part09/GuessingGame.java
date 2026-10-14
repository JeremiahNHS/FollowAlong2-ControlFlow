package part09;
// imports the scanner tool from the java utilities folder
import java.util.Scanner;
// imports the random tool from the java utilities folder
import java.util.Random;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
// defines the name of the class
public class GuessingGame {
    // the main method alerts java this is the start of the program and makes it executable
    public static void main(String[] args){
        // initializes a new Random object called random to generate a random number
        Random random = new Random();
        // initializes a new Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // nextInt(100) gives a random number from 0-99 so I add 1 to get on from 1-100; the value is then stored in the int variable randInt
        int randInt = random.nextInt(100) + 1;
        // this is where the users guess will be stored; it starts a 0 so the condition for the while loop will always be true at the start of the program since secret number is 1-100
        int guess = 0;
        // the computer prints out the text "I'm thinking of a number between 1 and 100."
        System.out.println("I'm thinking of a number between 1 and 100.");
        // this int variable tracks the amount of attempts taken and is updated by 1 each guess
        int attempts = 0;
        // while the guess is not equal to the secret number it will keep asking for guesses until the player guesses the right number
        while (guess != randInt){
            // prints out the text prompting for a guess
            System.out.print("Your guess: ");
            // reads the input and stores it in the variable guess
            guess = scanner.nextInt();
            // updates the attempts taken by 1
            attempts += 1;
            // if the guess is higher than the secret number it runs the code in the {}
            if (guess > randInt){
                // prints out "Too high!" if the guess is too high
                System.out.println("Too high!");
            // else if the guess is lower than the secret number it runs the code in the {}
            } else if (guess < randInt){
                // prints out "Too low!" if the guess is too low
                System.out.println("Too low!");
           }
        }
        // this code is only ran if the conditions for the while loop is false aka the guess is correct; it lets the player know they're correct and the amount of attempts taken
        System.out.println("Correct! You got it in " + attempts + " guesses.");
    }
}
