package com.brunoyam.lessons.lesson2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Условный оператор if
//        System.out.println("На улице идёт дождь?");
//        System.out.println("Если да - введите true");
//        System.out.println("Если нет - введите false");
//        boolean isRaining = scanner.nextBoolean();
//
//        if (isRaining) {
//            System.out.println("Берём зонт!");
//        } else {
//            System.out.println("Не берём зонт!");
//        }
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if ( a % b == 0 ) {
//            System.out.println("Да!");
//        } else {
//            System.out.println("Нет!");
//        }
//        System.out.println("Загадайте число от 1 до 5");
//        int chislo = scanner.nextInt();
//        boolean flag = false;
//        for (int i = 1 ; i <= 5 ; i ++ ){
//            if (chislo == i ){
//                System.out.println("Вы загадали " + i);
//                flag = true;
//            }
//            }
//        if(flag == false) System.out.println("Не в те границы чувак");
//

//        int number = scanner.nextInt();
//        switch (number) {
//            case 1 -> System.out.println("Вы загадали цифру один");
//            case 2 -> System.out.println("Вы загадали цифру два");
//            case 3 -> System.out.println("Вы загадали цифру три");
//            case 4 -> System.out.println("Вы загадали цифру четыре");
//            case 5 -> System.out.println("Вы загадали цифру пять");
//            case 6 -> System.out.println("Вы загадали цифру шесть");
//            case 7 -> System.out.println("Вы загадали цифру семь");
//            default -> System.out.println("Цифра не входит в диапазон");
//        }
        System.out.println("Введите число в диапазоне [1,10]");
        int number = scanner.nextInt();
        switch (number){
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Вы ввели четное число");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Вы ввели нечетное число");
                break;
            default:
                System.out.println("Число не входит в [1,10]");
        }

            }
        }



