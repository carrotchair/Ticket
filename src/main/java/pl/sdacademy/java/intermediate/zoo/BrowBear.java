package pl.sdacademy.java.intermediate.zoo;

import pl.sdacademy.java.intermediate.zoo.FatalAttack.Battle;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.LightAttack;

public class BrowBear extends Bear implements Attacable {
    private final Battle battleAlgorithm;

    BrowBear() {
        battleAlgorithm = new LightAttack();
    }

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    public String display() {
        return "BrownBear";
    }

    @Override
    public String attack(Bear bear) {
        return battleAlgorithm.fight(this, bear);
    }
}
