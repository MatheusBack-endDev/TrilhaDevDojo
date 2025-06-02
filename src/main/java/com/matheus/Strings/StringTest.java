package com.matheus.Strings;

public class StringTest {
    public static void main(String[] args) {
        String nome = "matheus"; //String constant pool
        String nome2 = "matheus";
        nome = nome.concat(" markson"); // nome += " markson"
        System.out.println(nome == nome2); // O == compara referencia da memoria e nao o valor da string

    }
}
