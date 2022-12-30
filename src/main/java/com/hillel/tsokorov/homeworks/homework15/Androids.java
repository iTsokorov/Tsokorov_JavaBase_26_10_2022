package com.hillel.tsokorov.homeworks.homework15;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Android-phone is calling");

    }

    @Override
    public void sms() {
        System.out.println("Android-phone received an SMS");
    }

    @Override
    public void internet() {
        System.out.println("Android-phone has internet-connection");

    }

    @Override
    public void linuxOs() {
        System.out.println("LinuxOS can be downloaded");
    }
}
