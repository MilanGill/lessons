package com.brunoyam.lessons.lesson9.enums;

public class DayOfWeek {

    public static final DayOfWeek SUNDAY = new DayOfWeek("Воскресенье");
    public static final DayOfWeek SATURDAY = new DayOfWeek("Суббота");
    public static final DayOfWeek FRIDAY = new DayOfWeek("Пятница");
    public static final DayOfWeek THURSDAY = new DayOfWeek("Четверг");
    public static final DayOfWeek WEDNESDAY = new DayOfWeek("Среда");
    public static final DayOfWeek TUESDAY = new DayOfWeek("Вторник");
    public static final DayOfWeek MONDAY = new DayOfWeek("Понедельник");

    private String title;

    private DayOfWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
