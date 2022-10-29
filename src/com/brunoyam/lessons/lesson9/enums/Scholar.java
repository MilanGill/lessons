package com.brunoyam.lessons.lesson9.enums;

public class Scholar {
    private ScholarSchedule schedule;

    public Scholar(ScholarSchedule schedule) {
        this.schedule = schedule;
    }

    public void wakeUp() {
        switch (schedule.getToday()) {
            case SATURDAY, SUNDAY -> System.out.println("Иди ка на***!");
            default -> System.out.println("Блин, снова в школу!");
        }
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "schedule=" + schedule +
                '}';
    }
}
