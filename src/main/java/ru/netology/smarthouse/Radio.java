package ru.netology.smarthouse;

public class Radio {
    private int numberOfStation;
    private int volume;
    private int maxStation;
    private int maxVolume = 100;

    public Radio() {
        maxStation = 9;
    }


    public Radio(int totalOfStations) {
        maxStation = totalOfStations - 1;
    }


    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setNumberOfStation(int numberOfStation) {
        if (numberOfStation < 0) {
            numberOfStation = maxStation;
        }
        if (numberOfStation > maxStation) {
            numberOfStation = 0;
        }
        this.numberOfStation = numberOfStation;
    }

    public void next() {
        if (numberOfStation != maxStation) {
            numberOfStation++;
        } else {
            numberOfStation = 0;
        }
    }

    public void prev() {
        if (numberOfStation != 0) {
            numberOfStation = numberOfStation - 1;
        } else {
            numberOfStation = maxStation;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            volume = 0;
        }
        if (volume > maxVolume) {
            volume = maxVolume;
        }


        this.volume = volume;
    }

    public void louder() {
        if (volume != maxVolume) {
            volume++;
        } else {
            volume = maxVolume;
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