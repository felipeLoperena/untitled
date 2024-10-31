package com.example.structures.hashmap;

import java.util.HashMap;

public class HashMapExample {

    HashMap<String, Integer> map = new HashMap<>();

    public HashMapExample(){
        map.put("Uno", 1);
        map.put("Dos", 2);
        map.put("Tres", 3);
        map.put("Cuatro", 4);
        map.put("Cinco", 5);
    }

    public boolean existe(String key){
        if(map.containsKey(key)){
            return true;
        }
        return false;
    }

    public String deleteElement(String key){
        String mensaje = "Se elimino el elemento:" + key;
        map.remove(key);
        return mensaje;

    }

    public static void main(String[] args) {
        HashMapExample object = new HashMapExample();
        //object.map.forEach(map -> System.out.println());
        System.out.println(object.deleteElement("UNO"));
    }
    
}
