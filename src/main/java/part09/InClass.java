package part09;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps.

import java.util.Random;
import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — PLAN the guessing game together. No code yet.
        // Write each step of the game as a // comment, in plain English, in order.
        // 1. the computer picks a secret number between 1 and 100 once at the start of the program
        // 2. the player inputs a guess
        // 3. returns if its to high or to low and
        // 4. repeats step 2 and 3 until you guess correctly
        // 5. once you guess correctly the computer tells you how many guesses it took you



        // STEP 2 — fix the bugs. Each bug below is inside its own /* ... */.
        // Do ONE bug at a time: delete its /* line and its */ line, so Java sees it.
        // Read the red error (or watch what happens). Fix it. Run it. Then do the next bug.


        Random random = new Random();
        System.out.println("Random works: " + (random.nextInt(6) + 1));



        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int guess = scanner.nextInt();
        System.out.println("You typed " + guess);



        int count = 1;
        while (count <= 3) {
            System.out.println("Guess number " + count);
            count += 1;
        }

    }
}
