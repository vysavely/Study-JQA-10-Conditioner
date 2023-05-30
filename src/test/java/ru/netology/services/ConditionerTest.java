package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void shouldSetTemperature() {
        Conditioner cond = new Conditioner();

        cond.setCurrentTemperature(15);

        int expected = 15;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxTemperature() {
        Conditioner cond = new Conditioner();

        cond.setToMaxTemp();

        int expected = 30;
        int actual = cond.currentTemperature;

        Assertions.assertEquals(expected, actual);
        System.out.println(cond.currentTemperature);

    }

    @Test
    public void shouldNotSetTemperatureAboveMax() {
        Conditioner cond = new Conditioner();

        cond.setCurrentTemperature(50);

        int expected = 0;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTemperature50p() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(10);

        cond.increaseTemp50p();

        int expected = 15;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

}
