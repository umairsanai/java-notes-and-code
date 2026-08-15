package exception.custom_and_chaining_exceptions;

public class DuplicateUserException extends Exception {
    public DuplicateUserException() {
        super("The User with this email already exists!");
    }
}
