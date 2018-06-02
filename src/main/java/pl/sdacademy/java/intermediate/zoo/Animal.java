package pl.sdacademy.java.intermediate.zoo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal {
    private LocalDate lastEatTime;

    public Animal() {
        this.lastEatTime = LocalDate.now();
    }

    public void eat() throws IDontEatException {
        lastEatTime = LocalDate.now();
    }

    public boolean isAlive() {
        LocalDate tenDaysBeforeNow = LocalDate.now().minus(10, ChronoUnit.DAYS);
        return getLastEatTime() != null && getLastEatTime().isAfter(tenDaysBeforeNow);
    }

    LocalDate getLastEatTime() {
        return lastEatTime;
    }

    abstract public int getWeight();

    abstract public String display();

}
