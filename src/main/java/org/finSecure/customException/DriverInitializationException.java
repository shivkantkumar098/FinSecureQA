package org.finSecure.customException;

public class DriverInitializationException extends RuntimeException {
    public DriverInitializationException(String message) {
        super(message);
    }

    public DriverInitializationException(String message, Throwable cause) {
        super(message, cause);
    }
}
