package com.brunoyam.homeworks.First_Home_Experience;

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите колличество Градусов Цельсия");
        double doubleCelciy = keyboard.nextDouble();
        System.out.println("В " + doubleCelciy + " Градусах Цельсия " + ((doubleCelciy*1.8) + 32) + " Градусов Форенгейта");
    }
}
