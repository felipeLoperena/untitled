package com.example.structures.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Array{

    public String[] listaCadenas = {"Hello", "World"};
    public int[] listaNumeros = {1, 2};
    public Vector<Integer> vector = new Vector<>();
    public ArrayList<Long> arrayList = new ArrayList<>();
    public List<Long> list = new ArrayList<>();
    public Map<Long, String> map = new HashMap<>();
    public TreeMap<Long, String> treeMap = new TreeMap<>();
    public TreeSet<Long> treeSet = new TreeSet<>();

    public Array(){
        getTreeSet();
        getVector();
        getArrayList();
        getList();
        getMap();
        getTreeMap();
    }

    private void getVector(){
        vector.add(1);
        vector.add(0);
        vector.add(1);
        vector.add(1);
        vector.add(0);
    }

    private void getList(){
        list.add(200L);
        list.add(50L);
        list.add(100L);
    }

    private void getArrayList(){
        arrayList.add(500L);
        arrayList.add(15L);
        arrayList.add(25L);
    }

    private void getMap(){
        map.put(1L, "Piso 1");
        map.put(2L, "Piso 2");
        map.put(3L, "Piso 3");
        map.put(4L, "Piso 4");
    }

    private void getTreeMap(){
        treeMap.put(4L, "Piso 4");
        treeMap.put(3L, "Piso 3");
        treeMap.put(50L, "Piso 50");
        treeMap.put(2L, "Piso 2");
        treeMap.put(1L, "Piso 1");
    }

    private void getTreeSet(){
        treeSet.add(500L);
        treeSet.add(50L);
        treeSet.add(100L);
        treeSet.add(100L);//Valores repetidos
        treeSet.add(100L);//Valores repetidos
        treeSet.add(100L);//Valores repetidos

    }

    public static void main(String[] args) {
        Array array = new Array();

        System.out.println(array.vector);
        System.out.println("--------------------");
        System.out.println(array.list);
        System.out.println("--------------------");
        System.out.println(array.arrayList);
        System.out.println("--------------------");
        System.out.println(array.map);
        System.out.println("--------------------");
        System.out.println(array.treeMap);
        System.out.println("--------------------");
        System.out.println(array.treeSet);

    }
}