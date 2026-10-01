package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ----- repeatWord -----

    @Test
    void repeatWordHiThreeTimes() {
        assertEquals("hihihi", Challenge.repeatWord("hi", 3));
    }

    @Test
    void repeatWordOnce() {
        assertEquals("Go", Challenge.repeatWord("Go", 1));
    }

    @Test
    void repeatWordZeroTimesIsEmpty() {
        assertEquals("", Challenge.repeatWord("abc", 0));
    }

    @Test
    void repeatWordKeepsSpaces() {
        assertEquals("ha ha ha ", Challenge.repeatWord("ha ", 3));
    }

    @Test
    void repeatWordFiveTimes() {
        assertEquals("xxxxx", Challenge.repeatWord("x", 5));
    }

    // ----- triangle -----

    @Test
    void triangleThreeRows() {
        assertEquals("*\n**\n***\n", Challenge.triangle(3));
    }

    @Test
    void triangleOneRow() {
        assertEquals("*\n", Challenge.triangle(1));
    }

    @Test
    void triangleZeroRowsIsEmpty() {
        assertEquals("", Challenge.triangle(0));
    }

    @Test
    void triangleFiveRows() {
        assertEquals("*\n**\n***\n****\n*****\n", Challenge.triangle(5));
    }
}
