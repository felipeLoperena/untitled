package com.example.structures.main;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploList {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Ana", "Carlos", "Beatriz", "David", "Ana", "Francisco");
        System.out.println("Hello World!");

        // Manipulación de datos con map, métodos de referencia y sorted, luego colección en un Set
        Set<String> nombresProcesados = nombres.stream()
                .map(String::toUpperCase) // Convierte cada nombre a mayúsculas
                .sorted(Comparator.reverseOrder()) // Ordena en orden descendente
                .collect(Collectors.toSet()); // Recolecta en un Set para eliminar duplicados

        nombresProcesados.forEach(System.out::println);
        
    }
}
