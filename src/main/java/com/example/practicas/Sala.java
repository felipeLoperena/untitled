package com.example.practicas;

import java.util.Scanner;

public class Sala {
    private static Sala sala = new Sala();
    private Scanner respuestaUsuario = new Scanner(System.in);
    private int numeroAsientos;

    private boolean[][] asientos = {
        {false, false, false},
        {false, false, false},
        {false, false, false}
    };

    private Sala(){}

    public static Sala getInstance(){
        return sala;
     }

    public boolean orquestador(int numeroAsientos){
        this.numeroAsientos = numeroAsientos; 
        visualizarSala();
        operacion(this.numeroAsientos);
        return false;
    }

    public static void main(String[] args) {
        Sala sala = Sala.getInstance();
        sala.orquestador(2);
        sala.orquestador(2);
    }

    private void operacion(int numeroAsientos){
        while(numeroAsientos > 0){
            System.out.println("Escoge el lugar que quieres ocupar: ");
            String asiento = respuestaUsuario.nextLine();
            int letra = asiento.charAt(0)-65;
            int numero = asiento.charAt(1)-49;
            if(asientos[letra][numero] != true ){
                asientos[letra][numero] = true;
                numeroAsientos--;
            }else{
                System.out.println("Este asiento ya se encuentra reservado, intente de nuevo");
            }            
        }
        
        muestraAsientosReservados();
    }

    public void visualizarSala(){
        System.out.println("---Bienvenido--");
        System.out.println("---------------");
        System.out.println("   1    2    3");
        System.out.println("A [A1] [A2] [A3]");
        System.out.println("B [B1] [B2] [B3]");
        System.out.println("C [C1] [C2] [C3]");
    }

    public void muestraAsientosReservados(){
        clearConsole();
        System.out.println("Transacción exitosa. Sus lugares han sido reservados!");
        System.out.println("   1      2      3");
        System.out.println("A ["+(asientos[0][0] ? "X" : " ")+"]    ["+(asientos[0][1] ? "X" : " ")+"]    ["+(asientos[0][2] ? "X" : " ")+"]");
        System.out.println("B ["+(asientos[1][0] ? "X" : " ")+"]    ["+(asientos[1][1] ? "X" : " ")+"]    ["+(asientos[1][2] ? "X" : " ")+"]");
        System.out.println("C ["+(asientos[2][0] ? "X" : " ")+"]    ["+(asientos[2][1] ? "X" : " ")+"]    ["+(asientos[2][2] ? "X" : " ")+"]");
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}