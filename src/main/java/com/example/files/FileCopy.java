package com.example.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileCopy {
    private static final Logger logger = LogManager.getLogger(FileCopy.class);
    public static void copyFile(String sourcePath, String destinationPath) {
        try (InputStream is = new FileInputStream(sourcePath);
             OutputStream os = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            logger.error("Ocurrio un error al copiar un archivo");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source = "C:\\Users\\Admin\\Desktop\\config.properties";
        String destination = "C:\\Users\\Admin\\Desktop\\Nueva\\config.properties";
        copyFile(source, destination);
    }
}
