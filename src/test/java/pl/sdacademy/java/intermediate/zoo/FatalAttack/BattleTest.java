package pl.sdacademy.java.intermediate.zoo.battle;

import org.junit.jupiter.api.Test;
import pl.sdacademy.java.intermediate.zoo.Bear;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.Battle;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.FatalAttack;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.LightAttack;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BattleTest {
    private Bear bear1 = mock(Bear.class);
    private Bear bear2 = mock(Bear.class);

    public BattleTest() {
        when(bear1.display()).thenReturn("Bear1");
        when(bear2.display()).thenReturn("Bear2");
    }

    @Test
    void shouldFatalBattleKillOpponent() {
        //given
        Battle battle = new FatalAttack();
        //when
        String fight = battle.fight(bear1, bear2);
        //then
        assertEquals( "Bear1 kill Bear2",fight);
    }
}
