package edu.epam.firsttask.exception;

public class EmptyArrayException extends Exception{
    public EmptyArrayException() {
    }

    public EmptyArrayException(String message) {
        super(message);
    }

    public EmptyArrayException(String message, Throwable cause) {
        super(message, cause);
    }
}
