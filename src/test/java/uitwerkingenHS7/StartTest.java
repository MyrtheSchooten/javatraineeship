package uitwerkingenHS7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartTest {

    @Test
    void testPersonDefaultGender() {
        Person p = new Person("Jan", 45);
        assertEquals(Gender.UNKNOWN, p.getGender());
    }

    @Test
    void testPersonHappyBirthday() throws PersonDiedExeption {
        Person p = new Person("Jan", 45);
        p.haveBirthday();
        assertEquals(46, p.getAge());
    }

    @Test
    void testPersonDiedException() {
        Person p = new Person("Jan", 129);
        assertThrows(PersonDiedExeption.class, p::haveBirthday);
    }
}
