package tweedePogingLabs3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartTest {

    @BeforeEach
    void init() {
        Start start = new Start();
    }

    @Test
    void testIPlusPlus() {
        assertEquals(1, Start.iPlusPlus(1));
    }

    @Test
    void testPlusPlusJ() {
        assertEquals(2, Start.plusPlusJ(1));
    }

    @Test
    void testBinarySum() {
        assertEquals(14, Start.BinarySum());
    }

    @Test
    void testTimeLater() {
        assertAll(
                () -> assertEquals(7, Start.TimeLater(23, 80)),
                () -> assertEquals(9, Start.TimeLater(1, 80))
        );

    }

    @Test
    void testDaysLater() {
        assertAll(
                () -> assertEquals(3, Start.daysLater(80)),
                () -> assertEquals(0, Start.daysLater(23))
        );

    }

    @Test
    void testClient() {
        Client client1 = new Client("Jan");
        Client client2 = new Client("Piet");
        client2 = client1;
        client2.naam = "Joris";
        assertEquals("Joris", client1.naam);
    }
}