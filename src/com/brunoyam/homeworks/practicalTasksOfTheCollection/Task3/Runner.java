package com.brunoyam.homeworks.practicalTasksOfTheCollection.Task3;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        HashMap<String,Product> hashMap = new HashMap<>();
        hashMap.put("Мишка",new Product(250));
        hashMap.put("Кошка",new Product(300));
        hashMap.put("Собака",new Product(200));
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}
