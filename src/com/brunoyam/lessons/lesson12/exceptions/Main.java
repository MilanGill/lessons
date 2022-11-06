package com.brunoyam.lessons.lesson12.exceptions;
// TODO Обработка исключений Exceptions
// Конструкция try/catch
public class Main {
    public static void main(String[] args) {
        // System.out.println("8 : 4 = " + MathUtil.divide(8,4));

        try {
            System.out.println("8 : 0 = " + MathUtil.divide(8,0));
        } catch (CheckedArithmeticException divideByZero) {    // обработка исключения
            System.out.println(divideByZero.getMessage());    // то, что мы делаем когда поймали Exception
        } finally { // выполняется в любом случае
            System.out.println("After try-catch");
        }

        // System.out.println("8 : 0 = " + MathUtil.divide(8,0));

        System.out.println("The end...");
    }
}
