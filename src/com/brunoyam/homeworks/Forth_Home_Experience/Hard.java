package com.brunoyam.homeworks.Forth_Home_Experience;

import java.util.Arrays;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последнее число последовательности Фибоначчи");
        int n = scanner.nextInt();
        int[] array = new int[n+1];
        if(n < 2 ){
            if (n != 0 ){
                array[n] = 1;
            }
        } else{
            array[1] = 1;
            array[2] = 1;
            for (int i = 2; i <= n ; i++){
                array[i] = array[i-1] + array[i-2];
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
