package com.brunoyam.homeworks.practicalTasksOfTheCollection.Task1;


//1. Создать динамический массив, содержащий объекты класса Contact. Класс Contact содержит имя контакта и его номер.
       // 2. Распечатать содержимое массива используя for each.
       // 3. Изменить номер первого контакта на новый.
       // 4. Удалить последний контакт из списка контактов.
       // 5. Получить массив содержащий контакты из коллекции тремя способами и вывести на консоль.
       // 6. Удалить все контакты из списка контактов.
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList <Contact> arrayList = new ArrayList<>();
        Contact milan = new Contact("Милан","+79516571009");
        Contact ekaterina = new Contact("Екатерина","+79045514249");
        arrayList.add(milan);
        arrayList.add(ekaterina);
        for(Contact i : arrayList){
            System.out.println(i);
        }
        arrayList.get(0).setNumber("+79516571008"); // меняем номер первого контакта на новый
        arrayList.remove(arrayList.size()-1); // удаляем последний элемент
        for(int i = 0 ; i < arrayList.size(); i ++){
            System.out.println(arrayList.get(i).getName() + " " + arrayList.get(i).getNumber());
        }
        for(int i = 0 ; i < arrayList.size(); i ++){
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList);
        // выше распечатал содержимое коллекции 3-мя способами
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);   // удалил все контакты из списка контактов
    }
}
