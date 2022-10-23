package com.brunoyam.lessons.lesson8.supereyword;

public class HeavyBox extends Box {
    private double weight;
// TODO super - обратиться к родителю
    public HeavyBox(double width, double height, double depth, double weight) {
        super(width, height, depth); // вызываем конструктор родителя
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
