package com.example.data;

import com.example.entity.Alumno;
import com.example.rendimiento.Rendimiento;

public class DataProcessor extends Thread{
    private Alumno data;

    public DataProcessor(Alumno data) {
        this.data = data;
    }

    public void run() {
        Rendimiento rendimiento = new Rendimiento();
        rendimiento.start();

        // Lógica de procesamiento de datos
        try {
            Thread.sleep(5000); // Simular procesamiento
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        rendimiento.end("SEG", "KB");

        System.out.println("Procesando id del alumno: '" +data.getId()+ "' "
                +"con nombre: '" +data.getName()+ "' "+
                rendimiento.getStatus());
    }
}


