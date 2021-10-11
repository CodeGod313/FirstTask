package edu.epam.firsttask.exception;

public class InvalidArrayIndexException extends Exception {
    public InvalidArrayIndexException() {
    }

    public InvalidArrayIndexException(Throwable cause) {
        super(cause);
    }

    public InvalidArrayIndexException(String message) {
        super(message);
    }

    public InvalidArrayIndexException(String message, Throwable cause) {
        super(message, cause);
    }
}
