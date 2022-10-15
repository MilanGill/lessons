package com.brunoyam.homeworks.Forth_Home_Experience;

import java.util.Arrays;
import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите конечное число последовательности");
        int n = scanner.nextInt();
        int [] array = new int[n+1];
        for (int i = 0 ; i <= n; i++){
            array[i] = i;
        }
        for (int i = 0; i <=n; i ++){
            System.out.print(array[n-i] + " ");
        }
    }
}
