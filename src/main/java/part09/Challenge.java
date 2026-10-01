package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminder: if / else if / else — part 06 (video: https://www.youtube.com/watch?v=xk4_1vDrzzo)
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part09/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.

public class Challenge {

    // The price of a movie ticket, in dollars.
    //   Younger than 5          -> 0  (free)
    //   65 or older             -> 5
    //   a student (any other age) -> 7
    //   everyone else           -> 10
    // ticketPrice(3, false)  should return 0
    // ticketPrice(70, true)  should return 5   (age rules come first)
    // ticketPrice(19, true)  should return 7
    // ticketPrice(30, false) should return 10
    public static int ticketPrice(int age, boolean student) {
        return 0;   // YOUR CODE
    }

    // The letter grade for a score.
    //   90 or more -> "A"    80 or more -> "B"    70 or more -> "C"
    //   60 or more -> "D"    anything lower -> "F"
    // letterGrade(95) should return "A"
    // letterGrade(80) should return "B"
    // letterGrade(59) should return "F"
    public static String letterGrade(int score) {
        return "";   // YOUR CODE
    }
}
