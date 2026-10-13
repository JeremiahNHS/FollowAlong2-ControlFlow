package part08;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

import java.util.Scanner;
// defines the name of the class
public class NestedLoops {
    // the main method lets java know this is the start of the program and makes it executable
    public static void main(String[] args){
        // initializes a new scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // declares an int variable named rows
        int rows;
        // declares an int variable named columns
        int columns;
        // initializes a string variable named symbol which points to an empty string
        String symbol = "";
        // prints out the text prompting user to enter number of rows
        System.out.println("Enter number of rows:");
        // reads the input and stores it in the int variable rows and waits for the enter key
        rows = scanner.nextInt();
        // prints out the text prompting user to enter number of columns
        System.out.println("Enter number of columns:");
        // reads the input and stores it in the int variable columns and waits for the enter key
        columns = scanner.nextInt();
        // prints out the text prompting user to enter a symbol to use
        System.out.println("Enter symbol to use:");
        // reads the input and stores it in the string variable symbol and waits for the enter key
        symbol = scanner.next();
        // starts i at 1, keep going while i is rows or less, and add 1 to i after each iteration
        for (int i = 1; i <= rows; i++){
            // prints a new line before printing the symbols for each row
            System.out.println();
            // starts j at 1, keep going while j is columns or less, and add 1 to j after each iteration; all iterations are ran b4 the outside loop can run its next
            for (int j = 1; j <= columns; j++){
                // prints out the symbols; .print allows for the symbols to be all on one line
                System.out.print(symbol);
            }
        }
    }
}
