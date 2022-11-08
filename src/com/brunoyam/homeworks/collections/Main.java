package com.brunoyam.homeworks.collections;

import com.brunoyam.lessons.lesson11.SortUtil;

public class Main {
    public static void main(String[] args) {
        ArrayListClass arrayList = new ArrayListClass();
        arrayList.push(5);
        arrayList.push(20);
        arrayList.push(50);
        Stack stack = new Stack(5);

        System.out.println("Динамический массив");
        System.out.println(arrayList);

        stack.addElement(5);
        stack.addElement(4);
        stack.addElement(4);
        stack.addElement(4);
        stack.addElement(4);
        System.out.println("Стэк");
        System.out.println(stack);

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addFirst(6);
        doublyLinkedList.addFirst(7);
        doublyLinkedList.addLast(8);
        doublyLinkedList.addLast(9);
        doublyLinkedList.removeFirst();
        doublyLinkedList.removeLast();
        System.out.println("Двусвязный список");
        doublyLinkedList.print();
        System.out.println();
        System.out.println("Элемент под индексом 1 в связном списке");
        System.out.println(doublyLinkedList.get(1));
    }
}
