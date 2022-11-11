package com.hillel.tsokorov.homeworks.homework2;

public class MyApp {
    public static void main(String[] args) {
        //My coordinates: Ukraine, Sumy Region, Konotop: 51°14'27.4"N and 33°12'18.19"E.

        String myCoordinates = "My coordinates";
        String country = "Ukraine";
        String region = "Sumy Region";
        String city = "Konotop";
        String wordAnd = "and";

        char symbOfColon = '\u003A';
        char space = '\u0020';
        char comma = '\u002C';
        char symbOfDegrees = '\u00B0';
        char symbOfMinutes = '\'';
        char symbOfSeconds = '\u0022';
        char north = '\u004E';
        char east = '\u0045';
        char point = '\u002E';

        int firstDegrees = 51;
        int firstMinutes = 14;
        double firstSeconds = 27.4;

        int secondDegrees = 33;
        int secondMinutes = 12;
        double secondSeconds = 18.19;

        //My coordinates: Ukraine, Sumy Region, Konotop: 51°14'27.4"N and 33°12'18.19"E.

        System.out.println(myCoordinates + symbOfColon + space + country + comma +
                space + region + comma + space + city + symbOfColon + space +
                firstDegrees + symbOfDegrees + firstMinutes + symbOfMinutes + firstSeconds +
                symbOfSeconds + north + space + wordAnd + space + secondDegrees +
                symbOfDegrees + secondMinutes + symbOfMinutes + secondSeconds + symbOfSeconds +
                east + point);

    }
}
