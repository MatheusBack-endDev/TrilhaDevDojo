package com.matheus.Strings;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        // Esse meotodo e um exemplo quando se trabalha com muitas string e torna o programa mais lento
        long comeco = System.currentTimeMillis(); //pega o millesegundos da maquina
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("fim do programa levou " + (fim - comeco) + "ms");

        comeco = System.currentTimeMillis(); //pega o millesegundos da maquina
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("fim do programa levou " + (fim - comeco) + "ms");
    }

    private static void  concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    //StringBuilder mais rapida para muitas Strings
    //usar quando
    private static void  concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    // Quase a mesma coisa que o StringBuilder a diferenca  e que ele e usando para treds (quando vairias pessoas estao usando simutaniamente)
    private static void  concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
