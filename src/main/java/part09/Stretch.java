package part09;
import java.util.Scanner;
import java.util.Random;

// Part 09 — CHECKPOINT. No video in this part.
// Reminders: while loops — part 07 · Scanner — part 03 · Random — part 05
// Video (only if you need it): https://www.youtube.com/watch?v=xk4_1vDrzzo
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        /* MY GUESS:
        32 5
        7 is odd
        4 is even
        1 is odd
         */
        int count = 0;
        int n = 1;
        while (n < 20) {
            n = n * 2;
            count++;
        }
        System.out.println(n + " " + count);

        int x = 7;
        while (x > 0) {
            if (x % 2 == 0) {
                System.out.println(x + " is even");
            } else {
                System.out.println(x + " is odd");
            }
            x -= 3;
        }

        //B1
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);

        //B2
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num < 1 || num > 10){
            System.out.print("Pick a number from 1 to 10: ");
            num = scanner.nextInt();
        }
        System.out.println("Thanks! You picked " + num + ".");

        //B3
        Random random = new Random();
        int die = 0;
        int tries = 0;

        while (die != 6){
            tries++;
            die = random.nextInt(6) + 1;
            System.out.println("Rolled a  " + die);
        }
        System.out.print("It took " + tries + " rolls to get a 6.");
    }

}
