package com.javarush.glushko.level27.lesson09.home01;

public class TransferObject {
    protected volatile boolean isValuePresent = false; //use this variable
    private int value;

    public synchronized int get() throws InterruptedException {
        if (!isValuePresent) {
            this.wait();
        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        this.notify();
        return value;
    }

    public synchronized void put(int value) throws InterruptedException {
        if (isValuePresent) {
            this.wait();
        }
        this.value = value;
        isValuePresent = true;
        System.out.println("Put: " + value);
        this.notify();
    }
}
