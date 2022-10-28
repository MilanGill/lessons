package com.brunoyam.homeworks.seven_homework.flowers;

public class Flower {
    private String country_manufactured;
    private int shelf_life_in_days;
    private int price;
    private static int quantity = 0;

    public Flower(String country_manufactured, int shelf_life_in_days, int price) {
        this.country_manufactured = country_manufactured;
        this.shelf_life_in_days = shelf_life_in_days;
        this.price = price;
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country_manufactured='" + country_manufactured + '\'' +
                ", shelf_life_in_days=" + shelf_life_in_days +
                ", price=" + price +
                '}';
    }
}
