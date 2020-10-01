package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int currentTemperature = conditioner.setCurrentTemperature(33);

        int maxTemperature = conditioner.setMaxTemperature(33);

        int expected = maxTemperature;

        assertEquals(expected, conditioner.increaseCurrentTemperature());

        System.out.println(expected);

    }

    @Test
    void testIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int currentTemperature = conditioner.setCurrentTemperature(20);

        int maxTemperature = conditioner.setMaxTemperature(33);

        int expected = currentTemperature + 1;

        assertEquals(expected, conditioner.increaseCurrentTemperature());

        System.out.println(expected);
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int currentTemperature = conditioner.setCurrentTemperature(13);

        int minTemperature = conditioner.setMinTemperature(13);

        int expected = minTemperature;

        assertEquals(expected, conditioner.decreaseCurrentTemperature());

        System.out.println(expected);
    }

    @Test
    void testDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        int currentTemperature = conditioner.setCurrentTemperature(20);

        int minTemperature = conditioner.setMinTemperature(13);

        int expected = currentTemperature - 1;

        assertEquals(expected, conditioner.decreaseCurrentTemperature());

        System.out.println(expected);
    }
}
