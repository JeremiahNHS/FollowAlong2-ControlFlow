package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// this line defines the name of the class
public class IfStatements {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes the variable age of type int with value 75
        int age = 75;
        /*
        this if statement checks if age is equal to 75;
        if true it executes the code in the curly brackets otherwise it moves to the else if statement
         */
        if (age == 75) {
            // prints out text
            System.out.println("OK boomer!");
        /*
        this else if statement checks if age is greater than or equal to 18;
        if true it executes the code in the curly brackets otherwise it moves to the next else if statement
         */
        } else if (age >= 18) {
            // prints out text
            System.out.println("You are an adult!");
        /*
        this else if statement checks if age is greater than or equal to 13;
        if true it executes the code in the curly brackets otherwise it moves to the final else statement
         */
        } else if (age >= 13){
            // prints text
            System.out.println("You are a teenager!");
        // this code is ran only if age doesn't meet any of the conditions above
        }else {
            // prints out text
            System.out.println("You are not an adult!");
        }
    }

}
