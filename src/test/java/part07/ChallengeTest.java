package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".
//
// When a test is red, read its message. For example:
//     digitCount(42) ==> expected: <2> but was: <0>
// means: you called digitCount(42), the right answer is 2, your code gave 0.

class ChallengeTest {

    // ---------- canPlay ----------

    @Test
    void canPlayWithHomeworkDone() {
        assertEquals(true, Challenge.canPlay(true, false, 10), "canPlay(true, false, 10)");
        assertEquals(false, Challenge.canPlay(false, false, 10), "canPlay(false, false, 10)");
    }

    @Test
    void canPlayOnTheWeekend() {
        assertEquals(true, Challenge.canPlay(false, true, 20), "canPlay(false, true, 20)");
        assertEquals(false, Challenge.canPlay(false, false, 20), "canPlay(false, false, 20)");
    }

    @Test
    void canPlayNotTooLate() {
        assertEquals(true, Challenge.canPlay(true, true, 20), "canPlay(true, true, 20)");
        assertEquals(false, Challenge.canPlay(true, true, 21), "canPlay(true, true, 21)");
    }

    @Test
    void canPlayNotTooEarly() {
        assertEquals(true, Challenge.canPlay(true, false, 8), "canPlay(true, false, 8)");
        assertEquals(false, Challenge.canPlay(true, false, 7), "canPlay(true, false, 7)");
    }

    @Test
    void canPlayNeedsHomeworkOrWeekend() {
        assertEquals(false, Challenge.canPlay(false, false, 15), "canPlay(false, false, 15)");
        assertEquals(true, Challenge.canPlay(true, true, 15), "canPlay(true, true, 15)");
    }

    // ---------- digitCount ----------

    @Test
    void digitCountOneDigit() {
        assertEquals(1, Challenge.digitCount(7), "digitCount(7)");
    }

    @Test
    void digitCountZero() {
        assertEquals(1, Challenge.digitCount(0), "digitCount(0)");
    }

    @Test
    void digitCountTwoAndThreeDigits() {
        assertEquals(2, Challenge.digitCount(42), "digitCount(42)");
        assertEquals(2, Challenge.digitCount(10), "digitCount(10)");
        assertEquals(3, Challenge.digitCount(999), "digitCount(999)");
    }

    @Test
    void digitCountBigNumbers() {
        assertEquals(5, Challenge.digitCount(12345), "digitCount(12345)");
        assertEquals(7, Challenge.digitCount(1000000), "digitCount(1000000)");
    }
}
