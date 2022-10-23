package com.brunoyam.homeworks.oop.oopHard;

public class Product {
    private String name;
    private int price;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String toString(){
        return name + " по цене " + price + " рублей, с рейтингом " + rating + "/10";
    }
}
