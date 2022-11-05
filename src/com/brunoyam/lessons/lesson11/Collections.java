package com.brunoyam.lessons.lesson11;


import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Map<String,Integer> persons = new LinkedHashMap<>();
        persons.put("Милан",20);
        persons.put("Лёха",40);
        persons.put("Егор",30);
        System.out.println(persons);

        Set<String> alphavit = new TreeSet<>();
        alphavit.add("F");
        alphavit.add("G");
        alphavit.add("O");
        alphavit.add("A");
        alphavit.add("B");
        alphavit.add("C");
        alphavit.add("D");
        alphavit.add("E");
        alphavit.add("R");
        alphavit.add("T");


        System.out.println(alphavit);

    }
}
