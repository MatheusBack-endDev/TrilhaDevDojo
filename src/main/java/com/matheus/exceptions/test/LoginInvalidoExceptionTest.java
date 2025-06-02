package com.matheus.exceptions.test;

import com.matheus.exceptions.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner src = new Scanner(System.in);
        String usuarioDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usuarioDigitado = src.nextLine();
        System.out.println("Senha");
        String senhaDigitado = src.nextLine();
        if (!senhaDB.equals(senhaDigitado) || !usuarioDB.equals(usuarioDigitado)){
            throw new LoginInvalidoException("senha ou usuario errados");
        }

    }
}
