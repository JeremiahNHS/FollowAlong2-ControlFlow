package part09;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ----- ticketPrice -----

    @Test
    void ticketPriceToddlerIsFree() {
        assertEquals(0, Challenge.ticketPrice(3, false));
    }

    @Test
    void ticketPriceAgeFourIsStillFree() {
        assertEquals(0, Challenge.ticketPrice(4, true));
    }

    @Test
    void ticketPriceSixtyFiveIsSenior() {
        assertEquals(5, Challenge.ticketPrice(65, false));
    }

    @Test
    void ticketPriceSeniorStudentPaysSeniorPrice() {
        assertEquals(5, Challenge.ticketPrice(70, true));
    }

    @Test
    void ticketPriceStudent() {
        assertEquals(7, Challenge.ticketPrice(19, true));
    }

    @Test
    void ticketPriceAdult() {
        assertEquals(10, Challenge.ticketPrice(30, false));
    }

    @Test
    void ticketPriceAgeFiveIsNotFree() {
        assertEquals(10, Challenge.ticketPrice(5, false));
    }

    // ----- letterGrade -----

    @Test
    void letterGradeA() {
        assertEquals("A", Challenge.letterGrade(95));
    }

    @Test
    void letterGradeNinetyIsA() {
        assertEquals("A", Challenge.letterGrade(90));
    }

    @Test
    void letterGradeEightyIsB() {
        assertEquals("B", Challenge.letterGrade(80));
    }

    @Test
    void letterGradeC() {
        assertEquals("C", Challenge.letterGrade(75));
    }

    @Test
    void letterGradeSixtyIsD() {
        assertEquals("D", Challenge.letterGrade(60));
    }

    @Test
    void letterGradeFiftyNineIsF() {
        assertEquals("F", Challenge.letterGrade(59));
    }

    @Test
    void letterGradeZeroIsF() {
        assertEquals("F", Challenge.letterGrade(0));
    }
}
