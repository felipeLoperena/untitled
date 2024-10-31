package com.example.structures.main;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
            set.add("Element 1");
            set.add("Element 1"); // No se añade porque ya existe
            set.add("Element 2"); // No se añade porque ya existe

            System.out.println(set);

    }
    
}
