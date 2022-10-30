package com.brunoyam.lessons.lesson10;

import com.brunoyam.homeworks.seven_homework.flowers.Main;

import java.math.BigInteger;
import java.util.LinkedList;

public class Recursive {
    public static void main(String[] args) {
        //counter(10);
        calculateFibNumversByLoop(100000);
        LinkedList<Integer> list = new LinkedList<>();

    }
        private static long calculateFibNumber ( int n){
            if (n == 0 || n == 1) return n;
            return calculateFibNumber(n - 1) + calculateFibNumber(n - 2);
        }

        private static BigInteger calculateFibNumversByLoop ( int n){
            BigInteger[] fibNumbers = new BigInteger[n + 1];
            fibNumbers[0] = (BigInteger.valueOf(0));
            fibNumbers[1] = (BigInteger.valueOf(1));
            if (n >= 2) {
                for (int i = 2; i <= n; i++) {
                    fibNumbers[i] = (fibNumbers[i - 1].add(fibNumbers[i - 2]));
                }
            }
            return fibNumbers[n];
        }


    }

