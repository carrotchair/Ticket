package pl.sdacademy.java.intermediate.zoo;

import pl.sdacademy.java.intermediate.zoo.FatalAttack.Battle;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.LightAttack;

public class BlackBear extends Bear implements Attacable {
    private final Battle battleAlgorithm;

    public BlackBear() {
        battleAlgorithm = new LightAttack();
    }

    @Override
    public int getWeight() {
        return 50;
    }

    @Override
    public String display() {
        return "BlackBear";
    }

    @Override
    public String attack(Bear bear) {
        return battleAlgorithm.fight(this, bear);
    }

}
