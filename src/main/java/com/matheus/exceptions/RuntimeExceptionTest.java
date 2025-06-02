package com.matheus.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        // Capturando multiplas excecoes
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("dentro do RuntimeException");
        }

        //multi catch em linha
        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
