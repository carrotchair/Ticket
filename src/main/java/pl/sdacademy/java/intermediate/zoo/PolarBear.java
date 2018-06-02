package pl.sdacademy.java.intermediate.zoo;

import pl.sdacademy.java.intermediate.zoo.FatalAttack.Battle;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.FatalAttack;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.LightAttack;

public class PolarBear extends Bear implements Attacable {
    private final Battle battleAlgorithm;

    PolarBear(Battle battleAlgorithm) {
        this.battleAlgorithm = battleAlgorithm;
    }

    public PolarBear() {
        battleAlgorithm = new FatalAttack();
    }

    @Override
    public int getWeight() {
        return 200;
    }

    @Override
    public String display() {
        return "PolarBear";
    }

    @Override
    public String attack(Bear bear) {
        return battleAlgorithm.fight(this, bear);
    }
}
