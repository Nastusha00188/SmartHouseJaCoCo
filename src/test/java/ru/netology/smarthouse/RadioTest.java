package ru.netology.smarthouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void findNumberOfStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(1);
        int expected = 1;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNullStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(0);
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(9);
        int expected = 9;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNumberOfStationAboveMax() {
        Radio radio = new Radio();
        radio.setNumberOfStation(10);
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findNumberOfStationBelowMin() {
        Radio radio = new Radio();
        radio.setNumberOfStation(-1);
        int expected = 9;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        int expected = 5;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void findMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void findVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
