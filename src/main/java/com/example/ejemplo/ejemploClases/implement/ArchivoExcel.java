package com.example.ejemplo.ejemploClases.implement;

import com.example.ejemplo.ejemploClases.abs.Archivo;

public class ArchivoExcel extends Archivo{

    @Override
    public void compareData() {
        System.out.println("Soy la implementación de Archivo"+ this.getClass());
    }

    
}
