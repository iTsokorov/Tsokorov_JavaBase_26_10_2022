package com.hillel.tsokorov.homeworks.homework16;

public class RockMusic extends MusicStyles{

    public RockMusic(String bandName) {
        super(bandName);
    }

    @Override
    public void playMusic() {
        System.out.println("Band " + getBandName() + " play rock-music");
    }
}
