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
        if (numberOfStation > 0) {
            numberOfStation = numberOfStation ++;
        }

        this.numberOfStation = numberOfStation;
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
}