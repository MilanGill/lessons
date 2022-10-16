package com.brunoyam.lessons.lesson6;

public class Classes {
    public static void main(String[] args) {
        User user = new User();
//        user.name = "Иван";
//        user.age = 20;
//        user.setName("Арнольд");
//        user.setAge(64);
        user.setNameAndAge("Арнольд",20);

        user.sayHello();
        user.speak();

        User user2 = new User();
        user2.name = "Иисус";
        user2.age = 33;

        System.out.printf("А меня зовут %s и я наглый, мне %d года\n", user2.getName(),user2.getAge());

        int yearsToRetirement = user2.calculateYearsToRetirement();
        System.out.printf("Мне Осталось %d года до пенсии, а тебе?\n", yearsToRetirement);
        int yearsToRetirement2 = user.calculateYearsToRetirement();
        System.out.printf("А мне еще целых %d лет до пенсии, я молодой!\n", yearsToRetirement2);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("Hello from class Test");

    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello from class Test2");
    }
}

class User {
    // Свойства
    String name;
    int age;
    // Поведение, то есть методы
    void speak() {
        System.out.printf("Меня зовут %s, мне %d года\n", name, age); // %s - строка, %d - число / перечисление через запятую
    }
    void sayHello() {
        System.out.println("Привет!");
    }
    int calculateYearsToRetirement() {
        return  65 - age;
    }

    void setName(String n) {
        name = n;
    }
    void setAge(int a){
        age = a;
    }
    void setNameAndAge(String n, int a) {
        name = n;
        age = a;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
