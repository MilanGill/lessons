package com.brunoyam.homeworks.seven_homework.normal;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Маленький принц","Антуан де Сент-Экзюпери");
        Reader reader = new Reader("Гилл Милан Сингх",228,"ФРТ","16.03.2002","+79516571009");
        reader.takeBook(book);
    }
}
