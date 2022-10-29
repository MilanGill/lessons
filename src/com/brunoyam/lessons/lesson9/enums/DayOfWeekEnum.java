package com.brunoyam.lessons.lesson9.enums;

public enum DayOfWeekEnum {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String title;

    DayOfWeekEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "title='" + title + '\'' +
                '}';
    }
}
