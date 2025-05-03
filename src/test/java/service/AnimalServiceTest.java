package service;

import com.prueba.model.Animal;
import com.prueba.service.AnimalService;
import com.prueba.service.AnimalServiceImpl;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalServiceTest {
    private  final AnimalService animalService = new AnimalServiceImpl();

    @Test
    void  testCrearAnimales(){
        String[] input = {"Perro|terrestre|guau", "Loro|volador|hola", "Delfín|acuatico|click"};
        List<Animal> animales = animalService.crearAnimale(input);
        assertEquals(3, animales.size());
    }

    @Test
    void testAgruparPorTipo() {
        String[] input = {"Perro|terrestre|guau", "Loro|volador|hola"};
        List<Animal> animales = animalService.crearAnimale(input);
        Map<String, List<Animal>> agrupados = animalService.agruparTipo(animales);
        assertEquals(2, agrupados.size());
    }

    @Test
    void testImprimirGrupos() {
        // Crear animales para probar
        String[] input = {"Perro|terrestre|guau", "Loro|volador|hola", "Delfín|acuatico|chillodo"
                ,"Leon|terrestre|ruge","Cocodrilo|acuatico|llora"};
        List<Animal> animales = animalService.crearAnimale(input);
        Map<String, List<Animal>> agrupados = animalService.agruparTipo(animales);

        // Capturar la salida de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;  // Guardar el flujo original
        System.setOut(new PrintStream(outContent));  // Redirigir la salida

        // Llamar al método que imprime
        animalService.imprimirGrupos(agrupados);

        System.setOut(originalOut);

        // Mostrar la salida capturada en la consola real
        System.out.println("Salida Capturada:\n" + outContent.toString());

    }

}
