package com.brunoyam.lessons.lesson7.incapsulation;

public class Car {
    private Engine engine = new Engine();
    void start(){
        engine.start();
        System.out.println("Starting car");
    }
    // TODO Парадигмы ООП и описание инкапсуляции
    // Парадигмы ООП (Инкапсуляция, Наследование, Полиморфизм, Абстракция)
    // Инкапсуляция - сокрытие данных через модификатор доступа private
    // Правильная инкапсуляция подразумевает полное сокрытие данных
    Engine getEngine() {
        return engine;
    }
    void setEngine(Engine e) {
        engine = e;
    }
}
