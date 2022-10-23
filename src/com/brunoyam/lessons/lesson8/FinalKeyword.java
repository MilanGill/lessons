package com.brunoyam.lessons.lesson8;
// TODO final (незменяемое)
public class FinalKeyword {
    static final int MY_FINAL_INTEGER = 0; // константа на всю программу




    public static void main(String[] args) {
        final double PI = 3.14; // final - что-то неизменяемое
        System.out.println(PI);

        System.out.println(MY_FINAL_INTEGER);
        printConstant("Hello, world!");

    }

    static void printConstant(final String constant){
        System.out.println("Constant: " + constant);
    }
}
