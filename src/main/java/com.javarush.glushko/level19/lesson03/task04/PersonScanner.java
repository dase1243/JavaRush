package com.javarush.glushko.level19.lesson03.task04;

import java.io.IOException;

public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
