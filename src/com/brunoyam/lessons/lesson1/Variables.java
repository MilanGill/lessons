package com.brunoyam.lessons.lesson1;

public class Variables {
    public static void main(String[] args) {
        // Переменнные бывают примитивных типов данных и также бывают ссылочного типа (String)
        String name = "Alex"; // Переменная хранит ссылку на ячейку памяти куда положился Alex
        System.out.println(name);

        String stringVariable = "Hello";
        String stringVariable2 = " World"; // неэффективный способ создания Строки
        String stringVariableSum = stringVariable + stringVariable2 + " " + 10; // Сложение двух строк называется конкатенацией
        System.out.println(stringVariableSum);
    }
}
