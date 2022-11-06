package com.brunoyam.lessons.lesson12.miltithreading;

public class A implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from thread A");
    }
}
