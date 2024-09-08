package lk.ijse.note_taker.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException() {}

    public UserNotFoundException(String message) {}

    public UserNotFoundException(String message, Throwable cause) {}
}
