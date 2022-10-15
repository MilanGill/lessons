package com.brunoyam.homeworks.First_Home_Experience;
import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Введите количество часов");
        double doubleHours = keyboard.nextInt();
        System.out.println("В " + doubleHours + " часах " + doubleHours*3600 + " секунд");
    }
}
