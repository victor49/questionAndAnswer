package com.proyecto.questionAndAnswer.domain.exception;

public class RoleExitedException extends RuntimeException {
    public RoleExitedException(){
        super("The role doesn't Excise");
    }
}
