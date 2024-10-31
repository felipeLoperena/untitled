package com.example.practicas;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String cadena = "Luis;Felipe;27;1996;CDMX";

        String[] arreglo = setArray(cadena);

        System.out.println("asList");
        Arrays.asList(arreglo).forEach(x -> System.out.println(x));
        System.out.println("Stream");
        Arrays.stream(arreglo).forEach(x -> System.out.println(x));
        System.out.println("Recursive");
        recursivo(arreglo, 0);
    }

    public static String[] setArray(String cadena){
        return cadena.split(";");
    }

    public static void recursivo(String[] lista, int index){
        if(index < lista.length){
            System.out.println(lista[index]);
            recursivo(lista,index+1);
        }
    }
}
