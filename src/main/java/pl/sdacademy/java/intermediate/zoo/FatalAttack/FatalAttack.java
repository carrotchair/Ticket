package pl.sdacademy.java.intermediate.zoo.FatalAttack;

import pl.sdacademy.java.intermediate.zoo.Attacable;
import pl.sdacademy.java.intermediate.zoo.Bear;

public class FatalAttack implements Battle {

    @Override
    public String fight(Bear attacker, Bear victim) {
        victim.setHp(0);
        return attacker.display() + " kill " + victim.display();
    }
}
