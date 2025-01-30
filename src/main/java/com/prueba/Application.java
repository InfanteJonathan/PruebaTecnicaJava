package com.prueba;

import com.prueba.config.AppConfig;
import com.prueba.model.Animal;
import com.prueba.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando la aplicación...");

        String[] input = {"Perro|terrestre|guau", "Loro|volador|hola", "Delfín|acuatico|chillodo"
        ,"Leon|terrestre|ruge","Cocodrilo|acuatico|llora"};

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AnimalService animalService = context.getBean(AnimalService.class);

        List<Animal> animales = animalService.crearAnimale(input);

        Map<String, List<Animal>> agrupados = animalService.agruparTipo(animales);

        System.out.println("Animales agrupados: " + agrupados.size());
        animalService.imprimirGrupos(agrupados);
        System.out.println("Aplicación finalizada.");
    }
}
