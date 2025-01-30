package com.prueba.model;

public abstract class Animal {
    protected  String nombre;
    protected  String onomatopeya;
    protected  AnimalType tipo;

    public Animal(String nombre, String onomatopeya, AnimalType tipo) {
        this.nombre = nombre;
        this.onomatopeya = onomatopeya;
        this.tipo = tipo;
    }

    public  abstract void  hacerSonido();

    public AnimalType getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
}
