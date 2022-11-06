package com.brunoyam.lessons.lesson12.exceptions;

public class MathUtil{
    public static int divide(int number1, int number2) throws CheckedArithmeticException {
        if (number2 == 0) {
            throw new CheckedArithmeticException("Вы поделили на ноль");
        }
        return number1/number2;
    }
}
