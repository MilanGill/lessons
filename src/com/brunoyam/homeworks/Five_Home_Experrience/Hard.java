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





    // Сортировка слияением (Посмотрет видос и скопипастил)


    public  void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}

