package part09;
import java.util.Scanner;
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

public class GuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randInt = random.nextInt(100) + 1;
        int guess = 0;
        System.out. println("I'm thinking of a number between 1 and 100.");
        int attempts = 0;

        while (guess != randInt){
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            attempts += 1;
            if (guess > randInt){
               System.out.println("Too high!");
           } else if (guess < randInt){
               System.out.println("Too low!");
           }
        }
        System.out.println("Correct! You got it in " + attempts + " guesses.");
    }
}
