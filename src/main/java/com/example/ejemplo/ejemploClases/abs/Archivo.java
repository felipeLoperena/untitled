package com.example.ejemplo.ejemploClases.abs;

public abstract class Archivo {
    private String nombreArchivo;
    private String tipoArchivo;
    private String categoria;

    public Archivo(){
        System.out.println("Cargando componentes de la clase");
    }

    public void write(){
        System.out.println("Escribiendo archivo" + this.getClass());
    }

    public abstract void compareData();

}
