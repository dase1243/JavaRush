package com.javarush.glushko.level15.lesson12.bonus02;

/**
 * Created by dreikaa on 11.08.2015.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}