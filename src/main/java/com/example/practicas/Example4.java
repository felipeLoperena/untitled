package com.example.practicas;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        Queue<Integer> colaBonita = new LinkedList<>();

        colaBonita.add(15);
        colaBonita.add(5);
        colaBonita.add(7);
        colaBonita.add(10);
        colaBonita.add(5);
        Set set = colaBonita.stream().map(x -> x*2).collect(Collectors.toSet());

        System.out.println(set);

        //recursive(colaBonita);
        List<String> nombres = Arrays.asList("Ana", "Carlos", "Beatriz", "David", "Alejandro", "Ana");

        // Agrupamos los nombres en un Map donde la clave es la longitud y el valor es el nombre
        Map<Integer, List<String>> nombresPorLongitud = nombres.stream()
                .collect(Collectors.groupingBy(String::length));

        nombresPorLongitud.forEach((length, nameList) -> {
            System.out.println("Longitud " + length + ": " + nameList);
        });
    }

    public static boolean recursive(Queue cola){
        if(cola.isEmpty()){
            return false;
        }else{
            System.out.println(cola.poll());
            recursive(cola);
        }
        return true;
    }
}