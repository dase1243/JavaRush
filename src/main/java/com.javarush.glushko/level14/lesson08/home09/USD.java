package com.javarush.glushko.level14.lesson08.home09;

/**
 * Created by dreikaa on 04.08.2015.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
