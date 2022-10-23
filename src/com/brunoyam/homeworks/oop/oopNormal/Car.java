package com.brunoyam.homeworks.oop.oopNormal;

public class Car {
    public Car(String brand_of_car, String class_of_car, double weight_of_car, String fio, int driving_experince,double power, double effiency) {
        this.brand_of_car = brand_of_car;
        this.class_of_car = class_of_car;
        this.weight_of_car = weight_of_car;
         driver.setFio(fio);
         driver.setDriving_experience(driving_experince);
         engine.setPower(power);
         engine.setEfficiency(effiency);
    }

    String brand_of_car;
    String class_of_car;
    double weight_of_car;
    Driver driver = new Driver();
    Engine engine = new Engine();

    void start() {
        System.out.println("Поехали");
    }
    void stop() {
        System.out.println("Останавливаемся");
    }
    void turnLeft() {
        System.out.println("Поворот налево");
    }
    void turnRight() {
        System.out.println("Поворот направо");
    }
    public String toString(){
        return (
                "Марка автомобился " + brand_of_car + "\n" +
                "Класс автомобился " + class_of_car + "\n" +
                "Вес автомобиля " + weight_of_car + "\n" +
                driver.toString() +
                engine.toString());
    }
}
