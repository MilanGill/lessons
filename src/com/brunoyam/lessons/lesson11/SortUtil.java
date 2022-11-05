package com.brunoyam.lessons.lesson11;

public class SortUtil {

    public static void bubbleSort(int[] array){
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i ++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void SortedByChoice(int[] array){
        for(int i = 0 ; i < array.length ; i ++){
            int min = array[i];
            int minIndex = i;

            for(int j = i + 1; j < array.length; j ++){
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
