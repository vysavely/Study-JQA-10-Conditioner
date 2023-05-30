package ru.netology.services;

public class Conditioner {
    public int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int newCurrentTemperature) {
        if (newCurrentTemperature < 0) {
            return;
        }
        if (newCurrentTemperature > 30) {
            return;
        }
        currentTemperature = newCurrentTemperature;
    }

    public void increaseTemp50p() {
        int target = currentTemperature * 3 / 2;
        setCurrentTemperature(target);
    }

    public void setToMaxTemp() {
        currentTemperature = 30;
    }
}
