package com.brunoyam.homeworks.seven_homework.hard;

public class Main {
    public static void main(String[] args) {
        Student aspirant = new Aspirant("Милан","Гилл","Б-228",4.45,"Теория Струн");
        Student student = new Student("Андрей","Колев","А-228",5);
        Student[] students = new Student[2];
        students = new Student[]{aspirant,student};
        for (Student i : students){
            i.getScholarship();
        }

    }
}
