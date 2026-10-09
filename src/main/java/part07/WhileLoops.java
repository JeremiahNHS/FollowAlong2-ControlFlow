package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.
// this defines the name of the class
public class WhileLoops {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes a new Scanner variable in the heap called scanner
        Scanner scanner = new Scanner(System.in);
        // initializes the variable name of type String with the value of an empty string
        String name = "";
        // this runs the code in the {} once and if the condition at the bottom is true it will run until its false
        do {
            // prints out the text prompting the user to input their name
            System.out.print("Enter your name: ");
            // store the name inputted in the variable name and wait for the next enter
            name = scanner.nextLine();
          // sets the condition; if name is blank / empty the code above will continue to run
        } while (name.isBlank());
        // prints out the text along with the value name
        System.out.println("Hello " + name);
    }
}
