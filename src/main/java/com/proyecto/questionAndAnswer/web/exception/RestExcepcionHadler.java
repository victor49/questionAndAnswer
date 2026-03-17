package com.proyecto.questionAndAnswer.web.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.proyecto.questionAndAnswer.domain.exception.RoleExitedException;

@RestControllerAdvice
public class RestExcepcionHadler {
    @ExceptionHandler(RoleExitedException.class)
    public ResponseEntity<Error> haldleException(RoleExitedException ex){
        Error error = new Error("Doesn't-exist", ex.getMessage()); 
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception ex){
        Error error = new Error("Unknown-error", ex.getMessage());
        
        return ResponseEntity.badRequest().body(error);
    }

}
