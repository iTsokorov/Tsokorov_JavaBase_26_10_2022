package com.hillel.tsokorov.homeworks.homework16;

public abstract class MusicStyles {
    private final String bandName;

    public MusicStyles(String bandName) {
        this.bandName = bandName;
    }

    public abstract void playMusic();

    public String getBandName() {
        return bandName;
    }
}
