package com.brunoyam.lessons.lesson7.statickeyword;
// TODO Static дает возможность обращаться к методу,полю без создания объекта
// <Назв класса.<Имя метода,поля>>
// Статическая переменая привязана только к классу (все объекты будут опираться на одно поле)
// Статические
public class Main {
    int noStaticVariable;
    static int staticVariable;



    public static void main(String[] args) {
        System.out.println(staticVariable);
        System.out.println(Car.color);
        Car.print();

        Car.color = "blue";
    }
}
