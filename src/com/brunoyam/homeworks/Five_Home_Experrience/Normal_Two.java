package com.brunoyam.homeworks.Five_Home_Experrience;

public class Normal_Two {
    public static void main(String[] args) {

    }
}

class Car{
    String mark;
    String automobileKlass;
    double weightOfCar;
    Driver driver;
    Engine engine;

    void start() {
        System.out.println("Стартуем");
    }
    void stop() {
        System.out.println("Останавливается");
    }
    void turnright(){
        System.out.println("Поворачивает на лево");
    }
    void turnreft(){
        System.out.println("Поворачиваем на право");
    }
    void toStringCar(){
        Engine engine1 = new Engine();
        System.out.println("Водитель автомобиля " + driver.FIO);
        System.out.println("Стаж вождения " + driver.drivingtime);
        System.out.println("Марка машины " + mark);
        System.out.println("Класс Автомобиля" + automobileKlass);
        System.out.println("Вес машины " + weightOfCar);
        System.out.println("Мощность мотора " + engine1.power);
        System.out.println("Производительность мотороа " + engine1.cpi);
    }
}

class Engine{
    double power;
    double cpi;
}

class Driver{
    String FIO;
    int drivingtime;
}
