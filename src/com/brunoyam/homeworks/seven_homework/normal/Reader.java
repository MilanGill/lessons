package com.brunoyam.homeworks.seven_homework.normal;

public class Reader {
    private String fio;
    private int readers_ticket_number;
    private String faculty;
    private String date_of_birth;
    private String telephone_number;

    public Reader(String fio, int readers_ticket_number, String faculty, String date_of_birth, String telephone_number) {
        this.fio = fio;
        this.readers_ticket_number = readers_ticket_number;
        this.faculty = faculty;
        this.date_of_birth = date_of_birth;
        this.telephone_number = telephone_number;
    }

    public void takeBook(int number_of_books){
        System.out.println(fio + " взял" + number_of_books + " книги.");
    }
    public void takeBook(String name_of_book){
        System.out.println(fio + " взял книгу " + name_of_book);
    }
    public void takeBook(Book book){
        System.out.println(fio + " взял книгу " + book.getName_of_book() + ", автор - " + book.getAuthor());
    }

    public void returnBook(int number_of_books){
        System.out.println(fio + " вернул" + number_of_books + " книги.");
    }
    public void returnBook(String name_of_book){
        System.out.println(fio + " вернул книгу " + name_of_book);
    }
    public void returnBook(Book book){
        System.out.println(fio + " вернул книгу " + book.getName_of_book() + ", автор - " + book.getAuthor());
    }

}
