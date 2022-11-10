package com.brunoyam.homeworks.threats.easy;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        int[] a = new int[10];
        Random random = new Random();
        for(int i = 0 ; i < a.length ; i++){
            a[i] = random.nextInt(0,101);
        }
        System.out.println(Arrays.toString(a));
        Thread thread1 = new Thread(() -> System.out.println(Arrays.stream(a).max().getAsInt()));
        Thread thread2 = new Thread(() -> System.out.println(Arrays.stream(a).min().getAsInt()));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}
