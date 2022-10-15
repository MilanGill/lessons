package com.brunoyam.lessons.lesson2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.next();
        System.out.println("Ваше Имя: " + name);

        scanner.nextLine();

        System.out.println("Введите ваше ФИО: ");
        String fio = scanner.nextLine();
        System.out.println("Ваше ФИО: " + fio);

    }
}
