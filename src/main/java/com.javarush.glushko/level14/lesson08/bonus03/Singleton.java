package com.javarush.glushko.level14.lesson08.bonus03;

/**
 * Created by dreikaa on 04.08.2015.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
