package com.brunoyam.lessons.lesson9.enums;

public class Demo {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
        System.out.println("День недели " + dayOfWeek.getTitle());

        ScholarSchedule schedule = new ScholarSchedule(DayOfWeekEnum.SATURDAY);

        Scholar scholar = new Scholar(schedule);

        scholar.wakeUp();

        System.out.println(scholar);
        System.out.println(DayOfWeekEnum.FRIDAY.getTitle());
    }
}
