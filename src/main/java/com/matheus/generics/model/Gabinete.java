package com.matheus.generics.model;

import java.util.ArrayList;
import java.util.List;

public class Gabinete<T> {
    private List<T> componentesGenerics;

    public Gabinete() {
        componentesGenerics = new ArrayList<>();
    }

    public void adicionarComponentes(T componente){
        componentesGenerics.add(componente);
    }

    public void mostrarComponentes(){
        for (T componente : componentesGenerics){
            System.out.println(componente);
        }
    }

    public List<T> getComponentesGenerics() {
        return componentesGenerics;
    }

    public void setComponentesGenerics(List<T> componentesGenerics) {
        this.componentesGenerics = componentesGenerics;
    }
}
