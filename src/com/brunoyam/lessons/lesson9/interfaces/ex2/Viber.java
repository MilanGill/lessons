package com.brunoyam.lessons.lesson9.interfaces.ex2;

public class Viber implements Messenger, Application{
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber!");
    }

    @Override
    public void getMessage() {
        System.out.println("Читаем сообщение в Viber!");
    }
}
