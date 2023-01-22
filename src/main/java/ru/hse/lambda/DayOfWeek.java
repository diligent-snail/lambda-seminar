package ru.hse.lambda;

public enum DayOfWeek {
    SATURDAY,
    SUNDAY;

    static {
        System.out.println("static");
    }

    DayOfWeek() {
        System.out.println("DayOfWeek");
    }

    public static void main(String[] args) {
        DayOfWeek.SUNDAY.ordinal();
    }
}
