package com.lucassellis.bff_agendadordetarefas.controller;


import com.lucassellis.bff_agendadordetarefas.infrastructure.exceptions.ConflictException;
import com.lucassellis.bff_agendadordetarefas.infrastructure.exceptions.IllegalArgumentException;
import com.lucassellis.bff_agendadordetarefas.infrastructure.exceptions.ResourceNotFoundException;
import com.lucassellis.bff_agendadordetarefas.infrastructure.exceptions.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(ResourceNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<String> handleConflictException(ConflictException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<String> handleUnauthorizedtException(UnauthorizedException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public  ResponseEntity<String>IllegalArgumentException(IllegalArgumentException ex){
        return  new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }



}
