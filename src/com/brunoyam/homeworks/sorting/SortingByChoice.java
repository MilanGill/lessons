package com.brunoyam.homeworks.sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingByChoice {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            array[i] = random.nextInt(0,101);
        }
        System.out.println("Массив до сортировки " + Arrays.toString(array));
        for(int i = 0 ; i < 9 ; i ++ ){
            int min = i;
            for (int j = i + 1; j < 10; j ++ ){
                if(array[j] < array[min]) min = j;
            }
            if (min!=i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }

}
