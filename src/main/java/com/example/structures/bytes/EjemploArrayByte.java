package com.example.structures.bytes;

import java.util.Arrays;
import java.util.Random;

public class EjemploArrayByte {
    public static void main(String[] args) {
        byte[] bytesCarga = new byte[5];
        byte[] bytesDescarga = new byte[5];

        Random randomByte = new Random();
        randomByte.nextBytes(bytesCarga);
        randomByte.nextBytes(bytesDescarga);

        System.out.println("Arreglo de bytes de carga aleatorios:    " + Arrays.toString(bytesCarga));
        System.out.println("Arreglo de bytes de descarga aleatorios: " + Arrays.toString(bytesDescarga));


        Arrays.sort(bytesCarga);
        Arrays.sort(bytesDescarga);

        System.out.println("Arreglo ordenado de bytes de carga aleatorios:    " + Arrays.toString(bytesCarga));
        System.out.println("Arreglo ordenado de bytes de descarga aleatorios: " + Arrays.toString(bytesDescarga));
    }
    
}
