package com.hillel.tsokorov.homeworks.homework16;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] bands = {
          new PopMusic("The Beatles"),
          new RockMusic("AC/DC"),
          new ClassicMusic("Orchestra")
        };

        for (MusicStyles style : bands) {
            style.playMusic();
        }
    }
}
