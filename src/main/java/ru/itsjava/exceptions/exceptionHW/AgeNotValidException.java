package ru.itsjava.exceptions.exceptionHW;

public class AgeNotValidException extends RuntimeException {

    public AgeNotValidException(String message) {
        super(message);
    }
}
