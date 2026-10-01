package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        logical operators start at about 81:35, while loops at about 89:11
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small problems. A test checks them for you:
// src/test/java/part07/ChallengeTest.java
//
// The top line of each problem is given to you. The inputs are already in the
// variables inside the ( ). Replace ONLY the line marked YOUR CODE.
// Your answer goes after the word return. You may add more lines above it.

public class Challenge {

    // Problem 1 — canPlay
    // You can play video games if your homework is done OR it is the weekend,
    // AND the hour is from 8 up to (but not including) 21.
    // Hours use a 24-hour clock: 8 is 8 AM, 20 is 8 PM, 21 is 9 PM.
    //
    //   canPlay(true, false, 10)   → true    homework done, 10 AM
    //   canPlay(false, true, 20)   → true    weekend, 8 PM
    //   canPlay(false, false, 15)  → false   no homework done, not the weekend
    //   canPlay(true, true, 21)    → false   too late
    //   canPlay(true, false, 7)    → false   too early
    public static boolean canPlay(boolean homeworkDone, boolean isWeekend, int hour) {
        return false;   // YOUR CODE — use && and ||
    }

    // Problem 2 — digitCount
    // Return how many digits n has. n is never negative. 0 has 1 digit.
    //
    //   digitCount(7)      → 1
    //   digitCount(42)     → 2
    //   digitCount(999)    → 3
    //   digitCount(12345)  → 5
    //   digitCount(0)      → 1
    //
    // Hint: n / 10 chops off the last digit. 12345 / 10 is 1234.
    // Use a while loop that keeps chopping and counts how many times.
    public static int digitCount(int n) {
        return 0;   // YOUR CODE — use a while loop
    }
}
