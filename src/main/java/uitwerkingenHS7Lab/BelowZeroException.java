package uitwerkingenHS7Lab;

public class BelowZeroException extends Throwable {
    public BelowZeroException(){
        super("U heeft te weinig geld voor deze transfer.");
    }
}
