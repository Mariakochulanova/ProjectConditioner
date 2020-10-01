package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public int setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
        return maxTemperature;
    }

    public int setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
        return minTemperature;
    }

    public int setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        return currentTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int increaseCurrentTemperature () {

        if(currentTemperature < maxTemperature){
            currentTemperature = currentTemperature + 1;
        }
        if (currentTemperature == maxTemperature){
            currentTemperature = maxTemperature;
        }

        return currentTemperature;
    }

    public int decreaseCurrentTemperature () {

        if(currentTemperature > minTemperature){
            currentTemperature = currentTemperature - 1;
        }
        if (currentTemperature == minTemperature) {
            currentTemperature = minTemperature;
        }
        return currentTemperature;
    }
}
