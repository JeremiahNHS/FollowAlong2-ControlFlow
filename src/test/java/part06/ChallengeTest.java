package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".
//
// When a test is red, read its message. For example:
//     canCharge(50, true) ==> expected: <true> but was: <false>
// means: you called canCharge(50, true), the right answer is true, your code gave false.

class ChallengeTest {

    // ---------- canCharge ----------

    @Test
    void canChargeWhenDockedAndNotFull() {
        assertEquals(true, Challenge.canCharge(50, true), "canCharge(50, true)");
        assertEquals(false, Challenge.canCharge(100, true), "canCharge(100, true)");
    }

    @Test
    void canChargeNeedsTheDock() {
        assertEquals(false, Challenge.canCharge(20, false), "canCharge(20, false)");
        assertEquals(true, Challenge.canCharge(20, true), "canCharge(20, true)");
    }

    @Test
    void canChargeWhenEmpty() {
        assertEquals(true, Challenge.canCharge(0, true), "canCharge(0, true)");
        assertEquals(false, Challenge.canCharge(0, false), "canCharge(0, false)");
    }

    @Test
    void canChargeRightBelowFull() {
        assertEquals(true, Challenge.canCharge(99, true), "canCharge(99, true)");
        assertEquals(false, Challenge.canCharge(100, false), "canCharge(100, false)");
    }

    // ---------- dayType ----------

    @Test
    void dayTypeFirstWeekday() {
        assertEquals("weekday", Challenge.dayType(1), "dayType(1)");
    }

    @Test
    void dayTypeMiddleWeekdays() {
        assertEquals("weekday", Challenge.dayType(3), "dayType(3)");
        assertEquals("weekday", Challenge.dayType(5), "dayType(5)");
    }

    @Test
    void dayTypeWeekend() {
        assertEquals("weekend", Challenge.dayType(6), "dayType(6)");
        assertEquals("weekend", Challenge.dayType(7), "dayType(7)");
    }

    @Test
    void dayTypeInvalid() {
        assertEquals("invalid", Challenge.dayType(0), "dayType(0)");
        assertEquals("invalid", Challenge.dayType(8), "dayType(8)");
        assertEquals("invalid", Challenge.dayType(-1), "dayType(-1)");
    }
}
