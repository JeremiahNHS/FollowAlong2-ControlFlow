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

public class WhileLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("Hello " + name);
    }
}
