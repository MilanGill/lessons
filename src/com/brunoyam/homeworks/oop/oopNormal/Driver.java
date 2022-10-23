package com.brunoyam.homeworks.oop.oopNormal;

public class Driver {
    private String fio;
    private int driving_experience;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDriving_experience() {
        return driving_experience;
    }

    public void setDriving_experience(int driving_experience) {
        this.driving_experience = driving_experience;
    }
    public String toString(){
        return fio + " " + driving_experience + " - стаж вождения   ";
    }
}
