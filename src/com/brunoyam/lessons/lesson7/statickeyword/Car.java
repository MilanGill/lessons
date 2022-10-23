package com.brunoyam.lessons.lesson7.statickeyword;

public class Car {
    public static int numbers_Of_Cars;
    private String color;

    public Car(String color) {
        this.color = color;
        numbers_Of_Cars++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
