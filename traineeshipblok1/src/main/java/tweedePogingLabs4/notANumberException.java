package tweedePogingLabs4;

public class notANumberException extends RuntimeException{
    public notANumberException() {
        super("Voer alleen getallen in.");
    }
}
