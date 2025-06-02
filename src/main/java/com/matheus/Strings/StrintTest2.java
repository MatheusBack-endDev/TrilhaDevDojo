package com.matheus.Strings;

public class StrintTest2 {
    public static void main(String[] args) {
        String nome = "matheus";
        System.out.println(nome.charAt(3)); // Retorna a letra de acordo com o indeci
        System.out.println(nome.length());
        System.out.println(nome.replace("t", "r"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0, nome.length()));
        System.out.println(nome.substring(0));
        System.out.println(nome.trim()); //Remove os espacos em brancos
    }
}
