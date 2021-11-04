package ru.netology.domain;

public class Radio {
    private int currentRS;
    private int currentVolume;
    private int minRS = 0;
    private int maxRS = 9;


    //метод увеличения радиостанции
    public void increaseRS() {
        if (currentRS >= 0 & currentRS < 9) {
            currentRS += 1;
        } else if (currentRS == 9) {
            currentRS = 0;
        } else {
            currentRS = 0;
        }
        setCurrentRS(currentRS);
    }

    //метод уменьшения радиостанции
    public void decreaseRS() {
        if (currentRS > 0 & currentRS < 10) {
            currentRS -= 1;
        } else if (currentRS == 0) {
            currentRS = 9;
        } else {
            currentRS = 0;
        }
        setCurrentRS(currentRS);
    }

    public int getCurrentRS() {
        return currentRS;
    }

    public void setCurrentRS(int currentRS) {
        this.currentRS = currentRS;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    //метод увеличения громкости
    public void increaseVolume() {
        if (currentVolume >= 0 & currentVolume < 10) {
            currentVolume += 1;
        } else if (currentVolume == 10) {
            currentVolume = 10;
        } else {
            currentVolume = 0;
        }
        setCurrentVolume(currentVolume);
    }

    //метод уменьшения громкости
    public void decreaseVolume() {
        if (currentVolume > 0 & currentVolume <= 10) {
            currentVolume -= 1;
        } else if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = 0;
        }
        setCurrentVolume(currentVolume);
    }


}
