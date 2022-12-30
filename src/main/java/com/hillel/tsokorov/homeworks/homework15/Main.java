package com.hillel.tsokorov.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        Androids samsung = new Androids();
        IPhones apple = new IPhones();

        samsung.call();
        samsung.sms();
        samsung.internet();
        samsung.linuxOs();

        System.out.println();

        apple.call();
        apple.sms();
        apple.internet();
        apple.updateOs();
    }
}