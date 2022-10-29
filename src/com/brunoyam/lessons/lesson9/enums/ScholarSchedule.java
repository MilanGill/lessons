package com.brunoyam.lessons.lesson9.enums;

public class ScholarSchedule {
    private DayOfWeekEnum today;

    public ScholarSchedule(DayOfWeekEnum today) {
        this.today = today;
    }

    public DayOfWeekEnum getToday() {
        return today;
    }

    public void setToday(DayOfWeekEnum today) {
        this.today = today;
    }

    @Override
    public String toString() {
        return "ScholarSchedule{" +
                "today=" + today +
                '}';
    }
}
