package com.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigReader {
    private static final Logger logger = LogManager.getLogger(ConfigReader.class);
    private Properties properties = new Properties();
    private String ruta = "C:\\Users\\Admin\\Desktop\\config.properties";

    public ConfigReader(){
        information();
        loadConfig(ruta);
    }
    public void loadConfig(String filePath) {
        try (InputStream is = new FileInputStream(filePath)) {
            properties.load(is);
            logger.info("Las propiedades se han cargado con exito");
        } catch (IOException ioException) {
            logger.error("Error al cargar las propiedades: ", ioException);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    private void information(){
        logger.info(".:INFO:.");
        logger.info("Esta es la informacion de la clase");
        logger.info("Nombre de la clase: "+ getClass());
        logger.info("Clase de los properties: "+ properties.getClass());
    }

    public static void main(String[] args) {
        ConfigReader configReader = new ConfigReader();

        String dbHost = configReader.getProperty("db.host");
        String dbPort = configReader.getProperty("db.port");

        logger.info("Database Host: " + dbHost);
        logger.info("Database Port: " + dbPort);
    }
}
