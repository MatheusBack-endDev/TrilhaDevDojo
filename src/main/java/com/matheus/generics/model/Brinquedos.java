package com.matheus.generics.model;

public class Brinquedos {
    private String name;

    public Brinquedos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brinquedos - " + name;
    }
}
