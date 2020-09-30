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

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
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
         int higherTemp = 0;

        if(currentTemperature < maxTemperature){
            higherTemp = currentTemperature + 1;
        }
        if (currentTemperature == maxTemperature){
            higherTemp = maxTemperature;
        }

        return higherTemp;
    }

}
