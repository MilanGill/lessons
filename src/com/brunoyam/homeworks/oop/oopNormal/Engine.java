package com.brunoyam.homeworks.oop.oopNormal;

public class Engine {
    private double power;
    private double efficiency;

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }
    public String toString(){
        return "Мощность:" + power + " Производительность:" + efficiency;
    }
}
