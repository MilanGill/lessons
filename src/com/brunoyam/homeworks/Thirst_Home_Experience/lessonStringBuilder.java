package com.brunoyam.homeworks.Thirst_Home_Experience;

import java.util.Scanner;

public class lessonStringBuilder {
    public static void main(String[] args) {
        //TODO StringBuilder
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello"); // Создаем объект класса StringBuilder(sb)
        sb.append(" my").append(" friend");
        System.out.println(sb); // Выводим на экран объект переведенный в строку

    }
}
