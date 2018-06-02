package pl.sdacademy.java.intermediate.zoo.FatalAttack;

import org.junit.jupiter.api.Test;
import pl.sdacademy.java.intermediate.zoo.Bear;
import pl.sdacademy.java.intermediate.zoo.BlackBear;
import pl.sdacademy.java.intermediate.zoo.IDontEatException;

import static org.junit.jupiter.api.Assertions.*;

class FatalAttackTest {
    private FatalAttack fatalAttack = new FatalAttack();

    @Test
    void shouldBearNotBeAliveAfterBattle() throws IDontEatException {
        //given
        Bear attacker = new BlackBear();
        Bear victim = new BlackBear();
        //when
        fatalAttack.fight(attacker, victim);
        //then
        assertFalse(((BlackBear) victim).isAlive(), "Victim should be dead");
        assertTrue(((BlackBear) attacker).isAlive());
    }
}