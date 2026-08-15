package exception.custom_and_chaining_exceptions;

public class AccountException extends Exception {
    public AccountException(Exception exc) {
        super(exc);
    }
}
