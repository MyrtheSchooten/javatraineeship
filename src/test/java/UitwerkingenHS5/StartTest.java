package UitwerkingenHS5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StartTest {
    @Test
    public void testGreatestOfTwoNumbers() {
        LabVijf labVijf = new LabVijf();
        int antwoord = labVijf.greatest(4,5);
        assertEquals(5,antwoord);
    }

    @Test
    public void testTweeGreatstOfTwoNumber() {
        LabVijf labVijf = new LabVijf();
        int antwoord = labVijf.greatest(17,8);
        assertEquals(17,antwoord);
    }

    @Test
   public void testGreatestString() {
        LabVijf labVijf = new LabVijf();
        String antwoord2 = labVijf.greatest("kortestring", "veellangerestring");
        assertEquals("veellangerestring", antwoord2);
    }

    @Test
    void testTweeGreatestString() {
        LabVijf labVijf = new LabVijf();
        String antwoord2 = labVijf.greatest("string1ishetlangst", "string2islang");
        assertEquals("string1ishetlangst", antwoord2);
    }

    @Test
    public void testGreatestNumber() {
        LabVijf labVijf = new LabVijf();
        int antwoord3 = labVijf.greatest(5);
        assertEquals(5, antwoord3);
    }

    @Test
    void testTweeGreatestNumber() {
        LabVijf labVijf = new LabVijf();
        int antwoord3 = labVijf.greatest(29);
        assertEquals(29, antwoord3);
    }

    @Test
    public void testFactorial() {
        LabVijf labVijf = new LabVijf();
        int antwoordFactorial = labVijf.factorial(5);
        assertEquals(120, antwoordFactorial);
    }

    @Test
    public void testTweeFactorial() {
        LabVijf labVijf = new LabVijf();
        int antwoordFactorial = labVijf.factorial(7);
        assertEquals(5040, antwoordFactorial);
    }

    @Test
    public void testNegatieveFactorial() {
        LabVijf labVijf = new LabVijf();
        int antwoordFactorial = labVijf.factorial(-1);
        assertEquals(1, antwoordFactorial);
    }


}