package com.brunoyam.lessons.lesson12.miltithreading;
// TODO Многопоточночность
public class Main {
    public static void main(String[] args)  {
        //Runnable a = new A(); // Создали экземпляр класса А, который реализует Interface Runnable
        //Thread threadA = new Thread(a); // Создали экземляр класса Thread и передали туда реализацию Interface Runnable
        //threadA.start(); // Запустили второй поток, который отправился на запуск паралельно
        // Упрощение
        //Thread threadB = new Thread(() -> System.out.println("Hello from thread B"));

        //Thread threadC = new Thread(() -> System.out.println("Hello from thread C")); // используем Лямбда выражение
        // для переопределения метода функционального интерфейса
        //threadC.start();
        //threadB.start();
        //System.out.println("Hello from main thread"); // Вывовод в консоль в главном потоке

        //D d = new D();
        //d.start();

        //if (d.isAlive()){
        //    System.out.println("Thread D is alive");
        //} else {
        //System.out.println("Помянем поток Д");
        //}
        //d.join();
        //System.out.println("After thread D");

        //if (d.isAlive()){
        //    System.out.println("Thread D is alive");
        //} else {
        //    System.out.println("Помянем поток Д");
        //}



        System.out.println();

        for(int i = 3; i > 0; i--){
            System.out.println("Программа завершится через : " + i + " сек");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
