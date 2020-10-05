package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
        return;
    }
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
        return;
    }
    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
        return;
    }
    public int getMaxTemperature(int maxTemperature) {
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
        if(currentTemperature + 1 > maxTemperature){
            currentTemperature = maxTemperature;
        }

        return currentTemperature;
    }

    public int decreaseCurrentTemperature () {

        if(currentTemperature > minTemperature){
            currentTemperature = currentTemperature - 1;
        }
        if(currentTemperature - 1 < minTemperature){
            currentTemperature = minTemperature;
        }
        return currentTemperature;
    }
}
