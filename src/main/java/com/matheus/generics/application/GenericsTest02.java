package com.matheus.generics.application;

import com.matheus.generics.model.Fonte;
import com.matheus.generics.model.Gabinete;
import com.matheus.generics.model.PlacaDeVideo;
import com.matheus.generics.model.PlacaMae;

public class GenericsTest02 {
    public static void main(String[] args) {

        PlacaMae b450 = new PlacaMae("B450", "ddr4");
        PlacaDeVideo rx580 = new PlacaDeVideo("Rx580");
        Fonte thunder = new Fonte("Thunder", 400);


        Gabinete<Object> gabinete = new Gabinete<>();
        gabinete.adicionarComponentes(b450);
        gabinete.adicionarComponentes(rx580);
        gabinete.adicionarComponentes(thunder);

        gabinete.mostrarComponentes();
    }
}
