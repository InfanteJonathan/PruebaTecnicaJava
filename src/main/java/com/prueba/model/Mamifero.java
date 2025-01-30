package com.prueba.model;

public class Mamifero extends  Animal{
    public Mamifero(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, AnimalType.TERRESTRE);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+" hace "+onomatopeya);
    }
}
