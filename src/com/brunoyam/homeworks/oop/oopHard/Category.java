package com.brunoyam.homeworks.oop.oopHard;

public class Category {
    private String name;
    private Product[] products_array;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts_array() {
        return products_array;
    }

    public void setProducts_array(Product[] products_array) {
        this.products_array = products_array;
    }

    public void print_list_of_products(Product[] products) {
        System.out.println(name);
        for (Product product : products) {
            System.out.println(product.getName() + " Цена: " + product.getPrice() + " рублей" + " Рейтинг: " + product.getRating() + "/10");
             }
    }

}
