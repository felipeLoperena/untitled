package com.example.ejemplo.ejemploClases.implement;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

import com.example.ejemplo.ejemploClases.abs.Archivo;

public class ArchivoSerializable extends Archivo implements Serializable{
    private static final long serialVersionUID = 8799656478674716638L;
    private String name;
    private String type;
    private Date dateCreate;

    public ArchivoSerializable(String name, String type, Date dateCreate){
        this.name = name;
        this.type = type;
        this.dateCreate = dateCreate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public void compareData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareData'");
    }

    

/* 
    private void readObject(java.io.ObjectInputStream stream)
        throws IOException, ClassNotFoundException
    {
        // Aqui debemos leer los bytes de stream y reconstruir el objeto
        ByteArrayOutputStream bs= new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream (bs);
        os.writeObject(unObjetoSerializable);  // this es de tipo DatoUdp
        os.close();
        byte[] bytes =  bs.toByteArray(); // devuelve byte[]
    }

    private void writeObject(java.io.ObjectOutputStream stream)
        throws IOException
    {
        // Aquí escribimos en stream los bytes que queramos que se envien por red.
        ByteArrayInputStream bs= new ByteArrayInputStream(bytes); // bytes es el byte[]
        ObjectInputStream is = new ObjectInputStream(bs);
        ClaseSerializable unObjetoSerializable = (ClaseSerializable)is.readObject();
        is.close();
    }
   */
}
