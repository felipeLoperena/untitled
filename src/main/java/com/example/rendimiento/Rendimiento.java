package com.example.rendimiento;

import java.util.logging.Logger;

public class Rendimiento {
    private static final Logger logger = Logger.getLogger(Rendimiento.class.getName());
    Runtime runtime = Runtime.getRuntime();
    private long startTime;
    private long memoryBefore;
    private long endTime;
    private long duration;
    private long memoryAfter;
    private long memoryConsumed;
    private double memoryConsumedInKilobytes;
    private double durationInSeconds;
    private String MEMORY;
    private String TIME;

    private String CONST_TIME_NANO = " nanosegundos";
    private String CONST_TIME_SEG = " segundos";
    private String CONST_MEMORY_B = " BYTES";
    private String CONST_MEMORY_KB = " KILOBYTES";
    private String CONST_MEMORY_MB = " MEGABYTES";
    private String ERROR_MSG = "No se pudo inicializar el tiempo de ejecución";

    public boolean start() {
        logger.info("Inicia método start()");
        try {
            startTime = System.currentTimeMillis(); //Inicia conteo del tiempo
            memoryBefore = runtime.totalMemory() - runtime.freeMemory();// Memoria antes de ejecutar el código
        }catch(Exception exception) {
            logger.severe(ERROR_MSG);
            return false;
        }
        return true;
    }

    public boolean end(String time, String memory) {
        logger.info("Inicia método end()");
        try {
            switch(time){
                case "SEG":
                    endTime = System.currentTimeMillis();
                    duration = endTime - startTime;
                    durationInSeconds = duration / 1000.0;  // Convertir a segundos
                    TIME = CONST_TIME_SEG;
                    break;
                case "MS":
                    endTime = System.nanoTime();
                    duration = endTime - startTime;
                    durationInSeconds = duration;
                    TIME = CONST_TIME_NANO;
                    break;
            }

            memoryAfter = runtime.totalMemory() - runtime.freeMemory();
            memoryConsumed = memoryAfter - memoryBefore;

            switch(memory){
                case "KB":
                    memoryConsumedInKilobytes = memoryConsumed / 1024.0;
                    MEMORY = CONST_MEMORY_KB;
                    break;
                case "MB":
                    memoryConsumedInKilobytes = memoryConsumed / (1024 * 1024);
                    MEMORY = CONST_MEMORY_MB;
                    break;
                case "B":
                    memoryConsumedInKilobytes = memoryConsumed;
                    MEMORY = CONST_MEMORY_B;
                    break;
            }
        }catch(Exception exception) {
            logger.severe(ERROR_MSG);
            return false;
        }
        return true;
    }

    public String getStatus() {
        logger.info("Inicia método getStatus()");
        String status = "Tiempo de ejecucion: " + durationInSeconds + TIME
                        +" Memoria consumida: " + memoryConsumedInKilobytes + MEMORY;
        return status;
    }
}
