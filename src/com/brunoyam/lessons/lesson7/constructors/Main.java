package com.brunoyam.lessons.lesson7.constructors;

public class Main {


    public static void main(String[] args) {
        User user = new User("Вася", 35);
//        user.setName("Вася");
//        user.setAge(35);
        System.out.printf("Привет! Меня зовут %s, мне %d лет \n", user.getName(), user.getAge());
    }
}
