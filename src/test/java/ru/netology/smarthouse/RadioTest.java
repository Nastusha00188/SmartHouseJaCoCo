package ru.netology.smarthouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void includingOfStation() {
        Radio radio = new Radio(10);
        radio.setNumberOfStation(9);
        int expected = 9;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

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
    public void nextStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinStation() {
        Radio radio = new Radio();
        radio.setNumberOfStation(0);
        radio.prev();
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
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void findVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 100;
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

    @Test
    public void louderVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.louder();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherThenMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(101);
        radio.louder();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherVolume() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.louder();
        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quieterThanMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.quieter();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void quieterVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.quieter();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}