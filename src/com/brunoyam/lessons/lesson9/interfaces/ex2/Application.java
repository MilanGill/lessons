package com.brunoyam.lessons.lesson9.interfaces.ex2;

public interface Application {
    default void start() {
        System.out.println("Мобильное приложение запускается");
    }

    static void test() {
        System.out.println("It is static method in Interface");
    }
}
