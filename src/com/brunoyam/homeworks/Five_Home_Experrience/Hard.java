package com.brunoyam.homeworks.Five_Home_Experrience;


import java.util.Arrays;
import java.util.Random;

public class Hard {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for(int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(101);
        }

        System.out.println("Массив до сортировки - " + Arrays.toString(array));
        Hard hard = new Hard();
        hard.bubbleSort(array);
        System.out.println("Массив после сортировки - " + Arrays.toString(array));
    }
    public void bubbleSort(int[] a){
        for (int i = a.length - 1 ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++) {
                if(a[j] > a[j + 1]){
                     int temp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = temp;

                }
            }
        }

    }

}