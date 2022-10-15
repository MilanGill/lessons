package com.brunoyam.homeworks.Thirst_Home_Experience;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections_ArrayList_Lesson {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();  // Integer - ссылочный тип, примитивные типы использовать нельзя
        // По конвенции Java Коллекций создаем тип объекта такой, от которого наследуется коллекция
        for(int i = 0 ; i < 10 ; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(0));  // ПОЛУЧЕНИЕ ЭЛЕМЕНТА ПО ИНДЕКСУ
        System.out.println(list.get(9));
        System.out.println(list.size()); // ПОЛУЧНИЕ РАЗМЕРА ARRAYLIST

        for(int i = 0; i < list.size() ; i++){
            System.out.print(list.get(i) + " ") ;
        }
        for(Integer x: list)   // ДЛЯ КАЖДОГО INTEGER В ARRAYLIST ВЫВОДИМ X НА ЭКРАН
            System.out.println(x);
        list.remove(5); /* не эффективен потому что ArrayList сделан на обычных массивах и
        когда размера не хватает - он создает новый массив в два раза больше и копирует элементы туда,
        поэтому удалять элемент из середины очень неэффективно */
        System.out.println(list);
        // мы проводим много удалений из нашего листа
        list = new LinkedList<>();
    }
}
