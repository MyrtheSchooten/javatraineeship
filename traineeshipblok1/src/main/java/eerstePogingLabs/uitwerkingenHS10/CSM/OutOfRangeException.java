package eerstePogingLabs.uitwerkingenHS10.CSM;

public class OutOfRangeException extends RuntimeException {
    public OutOfRangeException(){
        super("The discount is out of range.");
    }
}
