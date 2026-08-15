package exception.custom_and_chaining_exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient Funds!");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
