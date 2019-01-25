package com.javarush.glushko.level15.lesson12.home04;

/**
 * Created by dreikaa on 06.08.2015.
 */
public class Earth implements Planet {
    private static Earth instanse;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instanse == null) {
            instanse = new Earth();
        }
        return instanse;
    }
}