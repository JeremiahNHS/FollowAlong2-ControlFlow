package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// defines the name of the class
public class ForLoops {
    // the main method lets java know this is the start of the program and makes it executable
    public static void main(String[] args){
        // starts i at 10, keep going while i is greater than or equal to 0
        for (int i = 10; i >= 0;) {
            // prints out the value of i for that iteration
            System.out.println(i);
            // subtract 1 from i after each iteration
            i -= 2;
        }
        // prints out the text
        System.out.println("Happy New Year!");
    }
}
