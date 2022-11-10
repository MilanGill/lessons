package com.brunoyam.homeworks.practicalTasksOfTheCollection.Task2;

import com.brunoyam.homeworks.practicalTasksOfTheCollection.Task1.Contact;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Contact> linkedList = new LinkedList<>();
        Contact contact1 = new Contact("Милан","12312312312");
        Contact contact2 = new Contact("Олег","+7928123123");
        Contact contact3 = new Contact("Катя","+79516571009");
        linkedList.add(contact1);
        linkedList.add(contact2);
        linkedList.add(contact3);
        LinkedList<String> megafonNumbers = new LinkedList<>();
        for(Contact i : linkedList){
            if(checkMegafon(i.getNumber())){
                megafonNumbers.add(i.getNumber());
            }
        }
        System.out.println("Мегафоновские номера");
        System.out.println(megafonNumbers);
    }


    private static boolean checkMegafon(String number){
        String key1 = "+7928";
        String key2 = "8928";
        return number.startsWith(key1) || number.startsWith(key2);
    }


}
