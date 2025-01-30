package com.prueba.model;

public class Pez extends Animal{
    public Pez(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, AnimalType.ACUATICO);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+" hace "+onomatopeya);
    }
}
