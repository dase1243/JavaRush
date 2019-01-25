package com.javarush.glushko.level15.lesson12.home04;

/**
 * Created by dreikaa on 06.08.2015.
 */
public class Moon implements Planet {
    private static Moon instanse;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instanse == null) {
            instanse = new Moon();
        }
        return instanse;
    }
}