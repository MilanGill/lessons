package com.brunoyam.homeworks.oop.oopHard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Category category = new Category();

        Product book1 = new Product();
        Product book2 = new Product();
        Product book3 = new Product();

        book1.setName("Философия Java");
        book1.setPrice(1000);
        book1.setRating(10);

        book2.setName("Чистый код");
        book2.setPrice(700);
        book2.setRating(8);

        book3.setName("Грокаем Алгоритмы");
        book3.setPrice(1200);
        book3.setRating(9);

        Product[] books_for_Category = {book1,book2,book3};

        category.setProducts_array(books_for_Category);
        category.setName("Книги по программированию");
        category.print_list_of_products(category.getProducts_array());

        Basket basket = new Basket();
        System.out.println("Какую книгу вы хотите купить?");
        Scanner scanner = new Scanner(System.in);
        String name_of_purchased_book = scanner.nextLine();
        Product[] purchased_book = new Product[1];
        for (Product i : category.getProducts_array()){
            if (name_of_purchased_book.equals(i.getName())){
                System.out.print("Вы купили книгу ");
                System.out.println(i);
                purchased_book[0]=i;
                basket.setPurchased_products(purchased_book);
            }
        }
        User user = new User();
    }
}
