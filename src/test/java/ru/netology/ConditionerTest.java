package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void testIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.getCurrentTemperature();
        conditioner.setMaxTemperature(33);
        int expected = conditioner.getCurrentTemperature() + 1;
        assertEquals(expected, conditioner.increaseCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(33);
        conditioner.getCurrentTemperature();
        conditioner.setMaxTemperature(33);
        int expected = conditioner.getMaxTemperature(33);
        assertEquals(expected, conditioner.increaseCurrentTemperature());
        System.out.println(expected);
    }
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.getCurrentTemperature();
        conditioner.setMinTemperature(13);
        int expected = conditioner.getCurrentTemperature() - 1;
        assertEquals(expected, conditioner.decreaseCurrentTemperature());
        System.out.println(expected);
    }
    @Test
    void testDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(13);
        conditioner.getCurrentTemperature();
        conditioner.setMinTemperature(13);
        int expected = conditioner.getMinTemperature();
        assertEquals(expected, conditioner.decreaseCurrentTemperature());
        System.out.println(expected);
    }
}
