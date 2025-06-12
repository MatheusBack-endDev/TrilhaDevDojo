package com.matheus.generics.model;

public class PlacaMae {
    private String name;
    private String ddr;

    public PlacaMae(String name, String ddr) {
        this.name = name;
        this.ddr = ddr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDdr() {
        return ddr;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }

    @Override
    public String toString() {
        return "PlacaMae { " +
                "name = " + name + '\'' +
                ", ddr = " + ddr + '\'' +
                '}';
    }
}
