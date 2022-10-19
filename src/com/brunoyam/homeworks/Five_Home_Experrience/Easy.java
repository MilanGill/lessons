package com.brunoyam.homeworks.Five_Home_Experrience;

import java.util.Arrays;
import java.util.Random;


public class Easy {
    public static void main(String[] args) {
        int n = 12;
        int [] Array = new int[n];
        Random random = new Random();
        for (int i = 0 ; i < Array.length ; i++){
            Array[i] = random.nextInt(31);
        }
        System.out.println("Массив заполненный числами от 0 до 30 - " + Arrays.toString(Array));
        System.out.println("Индекс Максимального элемента - " + maxIndex(Array));
    }


    static int maxIndex (int[]Array) {
        int max = -1;
        int maxIndex = -1;
        for(int i = 0 ; i < Array.length ; i++){
            if(Array[i] > max){
                maxIndex = i;
                max = Array[i];
            }
        }
        return maxIndex;
    }
}
