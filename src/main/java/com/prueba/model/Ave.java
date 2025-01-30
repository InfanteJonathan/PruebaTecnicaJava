package com.prueba.model;

public class Ave extends  Animal{
    public Ave(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, AnimalType.VOLADOR);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace "+onomatopeya);
    }
}
