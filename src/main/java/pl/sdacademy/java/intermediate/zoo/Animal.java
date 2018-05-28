package pl.sdacademy.java.intermediate.zoo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Animal {
    private LocalDate lastEatTime;

    public void eat() throws IDontEatException {
        lastEatTime = LocalDate.now();
    }

    boolean isAlive() {
        LocalDate tenDaysBeforeNow = LocalDate.now().minus(10, ChronoUnit.DAYS);
        return getLastEatTime().isAfter(tenDaysBeforeNow);
    }

    LocalDate getLastEatTime() {
        return lastEatTime;
    }

    abstract public int getWeight();

}
