package com.example.structures.bytes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DatosBinarios {
    private static final Logger logger = LogManager.getLogger(DatosBinarios.class);
    byte[] data = new byte[1024];

    public DatosBinarios(String source, String destino){
        getpath(source, destino);
    }

    private void getpath(String source, String destino){
        try(InputStream fileInputStream = new FileInputStream(source); OutputStream fileOutputStream = new FileOutputStream(destino);){
            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer,0,  bytesRead);
            }
            //fileOutputStream.close();
            System.out.println("Se termino el trabajo");
        }catch(FileNotFoundException fileNotFoundException){
            System.out.println("Error al leer el archivo");
        }catch(IOException ioException){
            System.out.println("Error de I/O");
        }
    }

    public static void main(String[] args) {
        String source = "C:\\Users\\Admin\\Desktop\\TheMagmaProyect.txt";
        String destino = "C:\\Users\\Admin\\Desktop\\TheMagmaProyect2.txt";
        DatosBinarios datos = new DatosBinarios(source, destino);
    }
    //int bytesRead = fileInputStream.read(data);
    //fileInputStream.close();
}


