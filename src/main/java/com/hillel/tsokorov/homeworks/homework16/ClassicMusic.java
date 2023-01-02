package com.hillel.tsokorov.homeworks.homework16;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String bandName) {
        super(bandName);
    }

    @Override
    public void playMusic() {
        System.out.println("Band " + getBandName() + " play classic-music");
    }
}
