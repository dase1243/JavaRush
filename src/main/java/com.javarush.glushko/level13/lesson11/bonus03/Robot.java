package com.javarush.glushko.level13.lesson11.bonus03;

public class Robot extends AbstractRobot {
    private static int hitCount;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}