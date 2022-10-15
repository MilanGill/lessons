package com.brunoyam.homeworks.Second_Home_Experience;

import java.util.Objects;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        System.out.print("Введите ваш вариант ответа: ");
        String otvet = scanner.nextLine();
        int result = 0;
        if (Objects.equals(otvet, "Троллейбус") ||Objects.equals(otvet, "троллейбус") ){
            result = 1;
        }
        if (result == 1 ){
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }
    }
}
