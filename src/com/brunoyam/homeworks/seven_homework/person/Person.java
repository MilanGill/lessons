package com.brunoyam.homeworks.seven_homework.person;

public class Person {
    private String fullname;
    private int age;

    public Person() {
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void move() {
        System.out.println(fullname + " " + age + " лет " + "двигается");
    }
    public void talk() {
        System.out.println(fullname + " " + age + " лет " + "говорит");
    }
}
