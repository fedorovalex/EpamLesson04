package human;


import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Math.abs;

public class Human implements Comparable<Human> {

    private String name;
    private GregorianCalendar birthDate;
    private int passportNumber;

    public Human(String name, int dayBirth, int monthBirth, int yearBirth, int passportNumber) {
        this.name = name;
        this.birthDate = new GregorianCalendar(yearBirth, monthBirth + 1, dayBirth);
        this.passportNumber = abs(passportNumber);
    }

    @Override
    public int compareTo(Human other) {
        int yearBirthOther =  other.getYearBirth();
        int monthBirthOther =  other.getMonthBirth();
        int dayBirthOther = other.getDayBirth();
        int result = this.birthDate.compareTo(new GregorianCalendar(yearBirthOther, monthBirthOther, dayBirthOther));
        if (result != 0) {
            return -result;
        }
        return this.passportNumber - other.getPassportNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = abs(passportNumber);
    }

    public int getYearBirth() {
        return birthDate.get(Calendar.YEAR);
    }

    public void setYearBirth(int year) {
        birthDate.set(Calendar.YEAR, year);
    }

    public int getMonthBirth() {
        return birthDate.get(Calendar.MONTH);
    }

    public void setMonthBirth(int month) {
        birthDate.set(Calendar.MONTH, month);
    }

    public int getDayBirth() {
        return birthDate.get(Calendar.DAY_OF_MONTH);
    }

    public void setDayBirth(int day) {
        birthDate.set(Calendar.DAY_OF_MONTH, day);
    }
}
