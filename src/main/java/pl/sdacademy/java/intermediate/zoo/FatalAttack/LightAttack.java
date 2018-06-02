package pl.sdacademy.java.intermediate.zoo.FatalAttack;

import pl.sdacademy.java.intermediate.zoo.Bear;

public class LightAttack implements Battle {

    @Override
    public String fight(Bear attacker, Bear victim) {
        return attacker.display() + " hurt " + victim.display();
    }
}
