package com.prueba.service;

import com.prueba.model.Animal;

import java.util.List;
import java.util.Map;

public interface AnimalService {
    List<Animal>  crearAnimale(String[] datos);
    Map<String, List<Animal>> agruparTipo(List<Animal> animales);
    void imprimirGrupos(Map<String, List<Animal>> animalesGrupos);
}
