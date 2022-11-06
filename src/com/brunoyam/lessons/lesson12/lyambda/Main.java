package com.brunoyam.lessons.lesson12.lyambda;


public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = (a,b) -> a * b;
        Printable printable = System.out::println;
        printable.print(multiplier.multi(5,5));
    }

}
