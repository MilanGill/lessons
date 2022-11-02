package com.brunoyam.homeworks.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingByInserts {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0 ; i < 10 ; i ++ ){
            array[i] = random.nextInt(0,101);
        }
        System.out.println("Массива до сортировки " + Arrays.toString(array));
        for (int i = 1 ; i < 10 ; i ++){
            int element = array[i];
            int j = i;
            while ( j > 0 && (array[j-1] > element)){
                array[j] = array[j-1];
                j--;
            }
            array[j] = element;
        }
        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }
}
