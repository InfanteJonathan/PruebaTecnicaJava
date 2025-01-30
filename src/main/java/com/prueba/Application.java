package com.prueba;

//import com.prueba.config.AppConfig;
// com.prueba.model.Animal;
//import com.prueba.service.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        System.out.println("Iniciando la aplicación...");


        //String[] input = {"Perro|terrestre|guau", "Loro|volador|hola", "Delfín|acuatico|click"};
        // Iniciar contexto de Spring
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtener el servicio AnimalService del contexto
       // AnimalService animalService = context.getBean(AnimalService.class);

        // Crear animales a partir de los argumentos
        //List<Animal> animales = animalService.crearAnimale(input);

        // Agrupar los animales por tipo
        //Map<String, List<Animal>> agrupados = animalService.agruparTipo(animales);

        //System.out.println("Animales agrupados: " + agrupados.size());
        // Imprimir los animales agrupados por tipo
        //animalService.imprimirGrupos(agrupados);

        //System.out.println("Aplicación finalizada.");
    }
}
