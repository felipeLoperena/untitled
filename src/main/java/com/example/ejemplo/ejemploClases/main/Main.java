package com.example.ejemplo.ejemploClases.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ejemplo.ejemploClases.implement.ArchivoExcel;
import com.example.ejemplo.ejemploClases.implement.ArchivoSerializable;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        ArchivoExcel archivoExcel = new ArchivoExcel();

        ArchivoSerializable archivo = null;
         
        char[] letras = {'A','B','C','D','E','F','G'};

        List<ArchivoSerializable> listaDeArchivos = new ArrayList<>();

        for (int i = 0 ; i < letras.length ; i++){
            listaDeArchivos.add(new ArchivoSerializable("Componente "+letras[i], "excel", new Date(0)));
        }

        Gson gson = new Gson();

        String json = gson.toJson(listaDeArchivos);

        System.out.println(json);

        String json2 =" {'name':'Componente A','type':'excel','dateCreate':'dic 31, 1969'} ";

        ArchivoSerializable parsedData = gson.fromJson(json2, ArchivoSerializable.class);
        System.out.println("-------------------------------------------------------------");
        //System.out.println(parsedData.getName());

        Optional<String> cadena = null;
    }
}