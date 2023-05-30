package ru.netology.services;

import org.junit.jupiter.api.Test;

public class Test2 {


        @Test
        public void gsom() {

        Conditioner cond = new Conditioner();
        int test;
        System.out.println(cond.getCurrentTemperature());
        cond.setCurrentTemperature(20);
        System.out.println(cond.getCurrentTemperature());

    }



}