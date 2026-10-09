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
// this defines the name of the class
public class LogicalOperators {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes the variable temp of type int with the value of 15
        int temp = 15;
        // checks if temp is greater than 30; if true it executes the code in {}
        if (temp > 30) {
            // prints out the text
            System.out.println("It is hot outside!");
        // if the previous statement was false, this one checks if temp is within the range of 20 and 30; if true it executes the code in {}
        } else if (temp >= 20 && temp <= 30) {
            // prints out the text
            System.out.println("It is warm outside!");
        // this runs if all the previous conditions are not met
        } else {
            // prints out text
            System.out.println("It is cold outside!");
        }
        // initializes a new Scanner variable in the heap called scanner
        Scanner scanner = new Scanner(System.in);
        // prints out the text
        System.out.println("You are playing a game! Press q or Q to quit");
        // waits for the users response and stores it in the variable response of type string and waits for the user tp press enter
        String response = scanner.next();
        // checks if the value of response is not equal to q and Q; if both are true it executes the code in {}
        if (!response.equals("q") && !response.equals("Q")){
            // prints out the text
            System.out.println("You are still playing the game *pew pew*");
        // this runs if response is equal to q or Q
        } else {
            // prints out text
            System.out.println("You quit the game");
        }
    }
}
