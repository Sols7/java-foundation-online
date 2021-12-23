package ru.itsjava.enums;

public enum WeekDays {
    MONDAY("Понеделник"), TUESDAY("Вторник"), WEDNESDAY("Среда"),
    THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String translateWeekDay;

    WeekDays(String translateWeekDay){
        this.translateWeekDay = translateWeekDay;
    }

    @Override
    public String toString() {
        return "WeekDays{" + this.name() +
                " (translateWeekDay='" + translateWeekDay + "\')}\n";
    }


//    public String getCharacteristic() {
//        return characteristic;
//    }
//
//    @Override
//    public String toString() {
//        return "Coffee{" + this.name() +
//                " (characteristic='" + characteristic + "\')}\n";
//    }

}
