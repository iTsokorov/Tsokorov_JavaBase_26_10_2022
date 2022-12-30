package com.hillel.tsokorov.homeworks.homework15;

public class IPhones implements Smartphones, IOS{
    @Override
    public void call() {
        System.out.println("iPhone is calling");
    }

    @Override
    public void sms() {
        System.out.println("iPhone received an SMS");
    }

    @Override
    public void internet() {
        System.out.println("iPhone has internet-connection");
    }

    @Override
    public void updateOs() {
        System.out.println("iPhone can be updated");
    }
}
