package com.brunoyam.lessons.lesson12.exceptions;

public class MathUtil{
    public static int divide(int number1, int number2) throws CheckedArithmeticException, TestException{
        if (number2 == 0) {
            throw new CheckedArithmeticException("Вы поделили на ноль");
        }
        if (number2 == 5) {
            throw new  TestException("На 5 делить нельзя");
        }
        return number1/number2;
    }
}
