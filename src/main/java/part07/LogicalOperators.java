package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators {
    public static void main(String[] args){
        int temp = 15;

        if (temp > 30) {
            System.out.println("It is hot outside!");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        } else {
            System.out.println("It is cold outside!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game *pew pew*");
        } else {
            System.out.println("You quit the game");
        }
    }
}
