package com.hillel.tsokorov.homeworks.homework14;

public class Fitness {

    private final String name;
    private final int dayBorn;
    private final int monthBorn;
    private final int yearBorn;
    private final String email;
    private final String phoneNumber;
    private int age;
    private String surName;
    private int weight;
    private String pressure;
    private int dayStepScore;


    public Fitness(String name, String surName, int dayBorn, int monthBorn, int yearBorn, String eMail,
                   String phoneNumber, int weight, String pressure, int dayStepScore) {
        this.name = name;
        this.surName = surName;
        this.dayBorn = dayBorn;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
        this.email = eMail;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.dayStepScore = dayStepScore;
    }


    public String getName() {
        return name;
    }

    public int getDayBorn() {
        return dayBorn;
    }

    public int getMonthBorn() {
        return monthBorn;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getDayStepScore() {
        return dayStepScore;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setDayStepScore(int dayStepScore) {
        this.dayStepScore = dayStepScore;
    }
    public int getAge() {
        age = 2020 - yearBorn;
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Account info: " +
                "name = " + getName() +
                ", surname = " + getSurName() +
                ", day born = " + getDayBorn() +
                ", month born = " + getMonthBorn() +
                ", year born = " + getYearBorn() +
                ", age = " +  getAge() +
                ", eMail = " + getEmail() +
                ", phone number = " + getPhoneNumber() +
                ", weight = " + getWeight() + "kg" +
                ", pressure = " + getPressure() +
                ", day step score = " + getDayStepScore());
    }
}
