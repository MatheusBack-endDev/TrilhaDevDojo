package com.matheus.exceptions;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void  lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void  lerArquivo02() {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"));) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
