package ru.geekbrains.java2.dz.dz1.gubenkoDM;

/**
 * Created by Nestor on 30.11.2016.
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Возникла непредвиденная ситуация!. Возможная причина: ".concat(getMessage());
    }
}
