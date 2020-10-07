package Util;

import java.time.LocalDate;

public class DateHandler {
    private int day;
    private String month;
    private int year;


    public DateHandler(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateHandler(int day, String month) {
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static LocalDate getCurrentDate(){
        return LocalDate.now();
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
