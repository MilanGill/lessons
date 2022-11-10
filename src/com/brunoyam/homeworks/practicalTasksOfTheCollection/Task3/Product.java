package com.brunoyam.homeworks.practicalTasksOfTheCollection.Task3;

public class Product {
    private double weight;

    public Product(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return Double.toString(weight);
    }
}
