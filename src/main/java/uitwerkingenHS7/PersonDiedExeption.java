package uitwerkingenHS7;

public class PersonDiedExeption extends Exception{
    public PersonDiedExeption() {
        super("Persoon is ouder dan 130 jaar.");
    }
}