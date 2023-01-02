package com.hillel.tsokorov.homeworks.homework16;

public class PopMusic extends MusicStyles{

    public PopMusic(String bandName) {
        super(bandName);
    }

    @Override
    public void playMusic() {
        System.out.println("Band " + getBandName() + " play pop-music");
    }
}
