package com.brunoyam.lessons.lesson9.interfaces.ex2;

public class Smartphone {
   private final Application application;

   public Smartphone(Application application) {
      this.application = application;
   }

   public void startAplication() {
      application.start();
   }
}
