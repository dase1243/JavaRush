package com.javarush.glushko.level14.lesson08.home05;

/**
 * Created by dreikaa on 03.08.2015.
 */
public class Keyboard implements CompItem {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
