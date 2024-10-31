package com.example.entity;

import com.example.rendimiento.Rendimiento;
import java.util.LinkedList;

public class Alumno {
    private Integer id;
    private String name;
    private Boolean sexo;

    public Alumno(Integer id, String name, Boolean sexo){
        this.id = id;
        this.name = name;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }
}
