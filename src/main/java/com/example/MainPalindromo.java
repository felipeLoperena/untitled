package com.example;

import com.example.rendimiento.Rendimiento;

import java.util.Scanner;

public class MainPalindromo {
    public static void main(String[] args) {
        Rendimiento rendimiento = new Rendimiento();
        rendimiento.start();
        System.out.println("Este programa valida si la cadena de texto es un palindromo.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto para validar si es un palindromo: \n");
        String cadena = scanner.nextLine();

        boolean isPalindromo = validaPalindromo(cadena);
        System.out.println("La cadena : " + cadena);
        if(isPalindromo){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
        rendimiento.end("SEG", "KB");
        System.out.println(rendimiento.getStatus());
    }

    public static boolean validaPalindromo(String cadena){
        // Convertir la cadena a un array de caracteres
        char[] caracteres = cadena.toUpperCase().toCharArray();

        // Imprimir el array de caracteres
        for (int i = 0 ; i < caracteres.length ; i++) {
            int bandera = i+1;

            char caracterReverso = caracteres[caracteres.length - bandera];
            char caracterOriginal = caracteres[i];

            if(caracterOriginal != caracterReverso){
                return false;
            }
        }
        return true;
    }
}
