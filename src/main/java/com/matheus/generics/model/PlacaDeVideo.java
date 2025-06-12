package com.matheus.generics.model;

public class PlacaDeVideo {
    private String name;

    public PlacaDeVideo(String name) {
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
        return "PlacaDeVideo { " +
                "name = " + name + '\'' +
                '}';
    }
}
