package com.example.genericos;

public class GenericExample<T> {
    public T arreglo;

    public GenericExample(T entrada){
        this.arreglo = entrada;
    }

    public void tipoEntrada(){
        System.out.println("Tipo de entrada: " +arreglo.getClass());
    }

    public static void main(String[] args) {
        GenericExample<Long> entrada = new GenericExample<>(55555L);
        entrada.tipoEntrada();
    }
}
