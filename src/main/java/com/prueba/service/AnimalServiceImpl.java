package com.prueba.service;

import com.prueba.model.Animal;
import com.prueba.model.Ave;
import com.prueba.model.Mamifero;
import com.prueba.model.Pez;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements  AnimalService{


    @Override
    public List<Animal> crearAnimale(String[] datos) {
        List<Animal> animales = new ArrayList<>();
        for (String dato : datos) {
            String[] partes = dato.split("\\|");
            if (partes.length != 3) continue;

            String nombre = partes[0];
            String tipo = partes[1].toUpperCase();
            String onomatopeya = partes[2];

            switch (tipo) {
                case "TERRESTRE" -> animales.add(new Mamifero(nombre, onomatopeya));
                case "VOLADOR" -> animales.add(new Ave(nombre, onomatopeya));
                case "ACUATICO" -> animales.add(new Pez(nombre, onomatopeya));
            }
        }
        return animales;
    }

    @Override
    public Map<String, List<Animal>> agruparTipo(List<Animal> animales) {
        System.out.println("Animales agrupados: " + animales.size());

        return animales.stream().collect(Collectors.groupingBy(a -> a.getTipo().name()));
    }

    @Override
    public void imprimirGrupos(Map<String, List<Animal>> animalesGrupos) {
        animalesGrupos.forEach((tipo, lista) -> {
            System.out.println("\nAnimales " + tipo + ":");
            lista.forEach(animal -> {
                System.out.println("- " + animal.getNombre());
                animal.hacerSonido();
            });
        });
    }
}
