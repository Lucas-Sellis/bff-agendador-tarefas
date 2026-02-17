package com.lucassellis.bff_agendadordetarefas.infrastructure.exceptions;

public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException(String mensagem) {
        super(mensagem);
    }


}
