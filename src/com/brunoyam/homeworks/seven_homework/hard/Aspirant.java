package com.brunoyam.homeworks.seven_homework.hard;

public class Aspirant extends Student{
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (super.getAverageMark() == 5) return 1950;
        else if (super.getAverageMark() >=4) return 1910;
        else return 0;
    }
}
