package com.javarush.glushko.level28.lesson10.home01;

import java.util.concurrent.atomic.AtomicInteger;

public class Plant extends java.lang.Character {
    private final static AtomicInteger idSequence = new AtomicInteger();
    private final int id = idSequence.incrementAndGet();

    protected int getId() {
        return id;
    }
}