package com.example.structures.main;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import org.apache.logging.log4j.Logger;
import com.example.entity.Alumno;
import org.apache.logging.log4j.LogManager;

public class EjemploQueue {
    private static final Logger logger = LogManager.getLogger(EjemploQueue.class);
    public static Queue<Alumno> queue = new LinkedList<>();
    public static void main(String[] args) {
        llenarlista();
        try{
            logger.info("Validamos cual es el primero que entro: "+queue.element().getName());
            logger.info("Removemos el primer elemento de la cola: "+queue.poll().getName());
            logger.info("Actualiza cual es el primero que entro: "+queue.element().getName());
        }catch(NoSuchElementException noSuchElementException){
            logger.error("Error de lista vacia: ", noSuchElementException);
        }
    }

    public static void llenarlista(){
        Alumno alumno = new Alumno(1, "Luis", true);
        Alumno alumnoDos = new Alumno(2, "Felipe", true);
        Alumno alumnoTres = new Alumno(3, "Michell", false);
        //Aquí podríamos tomar los valores de una base de datos
        queue.add(alumno);
        queue.add(alumnoDos);
        queue.add(alumnoTres);
        logger.info("La lista se ha llenado con exito");
    }
}
