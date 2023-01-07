package com.srikar.scribbles.exception;

public class ScribbleNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public ScribbleNotFoundException(String message) {
        super(message);
    }
}
