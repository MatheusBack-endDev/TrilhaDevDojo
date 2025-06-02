package com.matheus.exceptions;

public class LoginInvalidoException extends Exception {

    //exception customizadas
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
