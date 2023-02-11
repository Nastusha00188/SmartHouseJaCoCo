package ru.netology.smarthouse;

public class Radio {
    private int numberOfStation;
    private int volume;

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setNumberOfStation(int numberOfStation) {
        if (numberOfStation < 0) {
            numberOfStation = 9;
        }
        if (numberOfStation > 9) {
            numberOfStation = 0;
        }
        this.numberOfStation = numberOfStation;
    }

    public void next() {
        if (numberOfStation != 9) {
            numberOfStation++;
        } else {
            numberOfStation = 0;
        }
    }

    public void prev() {
        if (numberOfStation != 0) {
            numberOfStation = numberOfStation - 1;
        } else {
            numberOfStation = 9;
        }
    }

    public void number() {
        if (numberOfStation > 9) {
            return;
        }
        if (numberOfStation < 0) {
            return;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            volume = 10;
        }
        if (volume > 0) {
            volume = volume++;
        }

        this.volume = volume;
    }

    public void louder() {
        if (volume != 10) {
            volume++;
        } else {
            volume = 10;
        }
    }

    public void quieter() {
        if (volume != 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }
}