package com.brunoyam.lessons.lesson7.statickeyword;

import com.sun.jdi.PrimitiveType;

import java.math.BigDecimal;
import java.util.Arrays;

import static java.lang.Math.*;
import static java.lang.Math.sin;

// TODO Static дает возможность обращаться к методу,полю без создания объекта
// <Назв класса.<Имя метода,поля>>
// Статическая переменая привязана только к классу (все объекты будут опираться на одно поле)
// Статические
public class Main {
    int noStaticVariable;
    static int staticVariable;



    public static void main(String[] args) {
        Car mercedes = new Car("White");
        System.out.println(mercedes);
        Car bmw = new Car("Blue");
        System.out.println(bmw);

        System.out.println("Количество машин:" + Car.numbers_Of_Cars);

        System.out.println();
        int result = MathUtil.sum(2,3);
        System.out.println("Result: " + result);

        BigDecimal bigDecimal = new BigDecimal(PI);
        System.out.println(bigDecimal);
        System.out.println("Синус тридцати градусов: " + (sin(PI/6)));

    }


}
