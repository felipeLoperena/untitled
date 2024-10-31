package com.example.ejemplo;

import com.example.exception.ExceptionHandler;

public class EjemploExceptionMain {
    private int a;
    private int b;
    private String operacion;
    private boolean isExitoso;

    public EjemploExceptionMain(int a, int b, String operacion) {
        this.a = a;
        this.b = b;
        this.operacion = operacion;
        this.algoritmo(a,b,operacion);
    }
     public static void main(String[] args) {
         EjemploExceptionMain ejemploExceptionMain = new EjemploExceptionMain(5,0,"SUMA");
     }

     public void algoritmo(int a, int b, String operacion) {
         try{
             boolean datoValidado = validaDatosB(b);
             if(datoValidado){
                int c = a/b;
                System.out.println(c);
             }
         }catch(ExceptionHandler exceptionHandler){
             System.out.println("Trone xd " + exceptionHandler);
         }
     }

     public boolean validaDatosB(int b) throws ExceptionHandler {
         if(b == 0){
             throw new ExceptionHandler();
         }
        return true;
     }
}
