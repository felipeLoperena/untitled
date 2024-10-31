package com.example.practicas;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example2 {
    public static void main(String[] args) {
        String[] lista = {"Juan","Marcos","Carlos","Matias"};
        StringBuilder cadena = new StringBuilder();
        Arrays.stream(lista).forEach(x -> {
            cadena.append(x+"|");
        });
        StringTokenizer st = new StringTokenizer(cadena.toString(),"|");
        String tok;
        while( st.hasMoreTokens() ){
            tok = st.nextToken();
            System.out.println(tok);
        }
    }
}
