package com.matheus.generics.model;

public class Fonte {
    private String name;
    private int voltagem;

    public Fonte(String name, int voltagem) {
        this.name = name;
        this.voltagem = voltagem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return "Fonte { " +
                "name = '" + name + '\'' +
                ", voltagem = " + voltagem +
                '}';
    }
}
