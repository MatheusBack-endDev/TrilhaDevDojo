package com.matheus.generics.model;

import java.util.ArrayList;
import java.util.List;

public class Caixa<T> {
    private List<T> itens;

    public Caixa() {
        itens = new ArrayList<>();
    }

    public void adicionarEquipamentos(T iten){
        itens.add(iten);
    }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Caixa = " + itens;
    }
}
