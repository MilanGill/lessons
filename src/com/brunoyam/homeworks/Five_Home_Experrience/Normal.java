package com.brunoyam.homeworks.Five_Home_Experrience;

import java.util.Arrays;
import java.util.Random;
import java.lang.*;
import java.util.Scanner;

public class Normal {
    public static void main(String[] args) {
        int[] Array = new int[10];
        Random random = new Random();
        for(int i = 0 ; i < Array.length ; i++){
            Array[i] = random.nextInt(20,101);
        }
        System.out.println(Arrays.toString(Array));
        Scanner scanner = new Scanner(System.in);
        int key = - 1;
        int otvet = scanner.nextInt();
        for (int i = 0 ; i < Array.length ; i++){
            if (otvet == Array[i]){
                key = i;
                System.out.println("Индекс элемента - " + key);
            }
        }
        if(key == -1){
            System.out.println("Ошибка");
        }
    }
}
