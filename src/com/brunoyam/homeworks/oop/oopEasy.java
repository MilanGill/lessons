package com.brunoyam.homeworks.oop;

public class oopEasy {
    public static void main(String[] args) {
    Person Katya = new Person();
    Katya.fullName = "Катюша";
    Katya.age = 42;
    Katya.move();
    Katya.talk();
    }
}

class Person {
    String fullName;
    int age;

    void move (){
        System.out.println("Человек по имени " + fullName + ", которому " + age + " лет," + " ходит!");
    }

    void talk(){
        System.out.println("Человек по имени " + fullName + ", которому " + age + " лет," + " говорит!");
    }
}