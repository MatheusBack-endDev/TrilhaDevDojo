package com.matheus.generics.application;

import com.matheus.generics.model.Brinquedos;
import com.matheus.generics.model.Caixa;

public class GenericsTest {
    public static void main(String[] args) {

        Brinquedos casaDeBoneca = new Brinquedos("Casa de Boneca");
        Brinquedos aviao = new Brinquedos("avião");
        Brinquedos bola = new Brinquedos("Bola");

        Caixa<Brinquedos> caixa = new Caixa();
        caixa.adicionarEquipamentos(casaDeBoneca);
        caixa.adicionarEquipamentos(aviao);
        caixa.adicionarEquipamentos(bola);

        System.out.println(caixa);
    }
}
