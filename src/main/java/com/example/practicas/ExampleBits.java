package com.example.practicas;

public class ExampleBits {
    public static void main(String[] args) {

        int x = -10;
        int resultado = (x ^ (x >> 31)) - (x >> 31); //Valores absolutos

        System.out.println(resultado);
    }

    public static boolean esPar(int num){
        return (num & 1) == 1 ? false : true;
    }
}
