package com.brunoyam.homeworks.sorting;



import java.util.Arrays;
import java.util.Random;

public class MergeSorting {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for ( int i = 0 ; i < 10 ; i ++){
            array[i] = random.nextInt(0,101);
        }
        System.out.println("Массив до сортировки " + Arrays.toString(array));
        MergeSort(array,0,99);
        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }
    private static void MergeSort(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        MergeSort(a, lo, mid);
        MergeSort(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}
