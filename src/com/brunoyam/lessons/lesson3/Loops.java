package com.brunoyam.lessons.lesson3;


import java.nio.file.Files;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int n = 0;
//        while (n<3) {
//            System.out.println("Hello, world");
//            n++;
//        }
//
//        int y, x = 0;
//        // Инкрементируем на единицу
//        y = x++;   // постфиксная форма
//        System.out.println("x = " + x + ", y = " + y);
//        y = ++x;   // префиксная форма
//        System.out.println("x = " + x + ", y = " + y);
//        Scanner scanner = new Scanner(System.in);
//        int input;
//        do {
//            System.out.println("Чтобы подтвердить, что вы не робот, введите 555");
//            input = scanner.nextInt();
//        } while (input != 555);
//        System.out.println("Вы не робот");
//        for (int i = 0 ; i <= 10; i+=5){
//            System.out.print(i + " ");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите сообщение для перевода");
//        String input = scanner.nextLine();
//        System.out.println("Введите ключ шифра Цезаря");
//        int key = scanner.nextInt();
//// System.out.println("Количество символов в строке \"" + input + "\": " + input.length());
//        for (int i = 0; i < input.length(); i++) {
//            char symbol = input.charAt(i);
//            char encodeSymbol = (char) (symbol + key);
//            System.out.print(
        // ОПЕРАТОРЫ BREAK AND CONTINUE
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5){
//                continue;    // Переход на следующую итерацию
//            }
//            if (i == 5){
//                break;   // Завершение цикла
//            }
//            System.out.print(i + " ");
//        }
//        int i = 1;
//        while(i <= 10){
//            if (i == 5){
//                i++;
//                continue;
//            }
//            i++;
//            System.out.println(i-1);
//        }
        // ЦИКЛЫ С МЕТКАМИ
//        egor:             // метка для цикла на том же уровне табуляции
//        for (int i = 1 ; i <= 3; i++){
//            System.out.print("Row " + i + ": ");
//            aleksei:
//            for (int j = 1 ; j <= 5; j ++) {
//                if (i == 1 && j == 3){
//                    continue egor;   // переходим на следующую итерацию внешнего цикла egor
//                }
//                if (i == 2 && j == 4){
//                    break aleksei;    // завершаем внутренний цикл с меткой aleksei
//                }
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
    }
}
