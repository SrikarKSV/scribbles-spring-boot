package com.srikar.scribbles.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {
    @ExceptionHandler(ScribbleNotFoundException.class)
    public String userNotFoundException(ScribbleNotFoundException ex) {
        return "error";
    }
}
