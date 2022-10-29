package com.brunoyam.lessons.lesson9.interfaces.ex2;

public class Demo {
    public static void main(String[] args) {
    Smartphone smartphone = new Smartphone(new WhatsApp());
    smartphone.startAplication();

    Client client = new Client(new WhatsApp());
    client.sendMessage();
    client.getMessage();
    Application.test();


    }
}
