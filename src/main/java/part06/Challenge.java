package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        if statements start at about 69:21, switches at about 76:36
// Guide: GUIDE.md in this folder, steps 2–5 (if) and 7–10 (switch)
//
// SECTION D — Challenge. Two small problems. A test checks them for you:
// src/test/java/part06/ChallengeTest.java
//
// For each problem: the top line is given to you. The inputs are already in the
// variables inside the ( ). Replace ONLY the line marked YOUR CODE.
// Your answer goes after the word return.

public class Challenge {

    // Problem 1 — canCharge
    // A robot should start charging when it is docked AND its battery is below 100.
    // Return true if it should charge, false if not.
    //
    //   canCharge(50, true)   → true    docked, battery not full
    //   canCharge(100, true)  → false   docked, but already full
    //   canCharge(20, false)  → false   not docked
    //   canCharge(0, true)    → true
    public static boolean canCharge(int battery, boolean docked) {
        if (battery < 100 && docked){
            return true;
        } else if (battery < 100 && !docked){
            return false;
        } else {
            return false;
        }
    }

    // Problem 2 — dayType
    // Days are numbered 1 to 7. Days 1–5 are "weekday". Days 6 and 7 are "weekend".
    // Any other number is "invalid".
    //
    //   dayType(1)  → "weekday"
    //   dayType(5)  → "weekday"
    //   dayType(6)  → "weekend"
    //   dayType(7)  → "weekend"
    //   dayType(0)  → "invalid"
    //   dayType(9)  → "invalid"
    public static String dayType(int day) {
        switch(day){
            case 1,2,3,4,5:
                return ("weekday");
            case 6,7:
                return ("weekend");
            default:
                return ("invalid");

        }
    }
}
