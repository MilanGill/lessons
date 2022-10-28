package com.brunoyam.homeworks.seven_homework.flowers;

import com.brunoyam.homeworks.oop.oopHard.Product;

public class Main {
    public static void main(String[] args) {
        Flower[] buket1 = new Flower[2];
        Flower[] buket2 = new Flower[2];
        Flower[] buket3 = new Flower[3];

         Flower rose = new Roses("Китай",14,300);
        Flower tulip = new Tulips("Россия",20,250);
        Flower carnation = new Carnations("Япония",7,400);
        Flower tulip2 = new Tulips("Китай", 30,500);
        Flower chrysanthemum = new Chrysanthemums("Германия",10,100);
        Flower rose2 = new Roses("Китай",14,300);
        Flower carnation2 = new Carnations("Япония",7,400);

        buket1 = new Flower[]{rose, tulip};
        buket2 = new Flower[]{carnation,tulip2};
        buket3 = new Flower[]{chrysanthemum,rose2,carnation2};

        System.out.println("Количество созданных цветов: " + Flower.getQuantity());
    }
}
