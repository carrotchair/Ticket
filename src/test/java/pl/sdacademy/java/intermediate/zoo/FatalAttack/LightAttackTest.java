package pl.sdacademy.java.intermediate.zoo.FatalAttack;

import org.junit.jupiter.api.Test;
import pl.sdacademy.java.intermediate.zoo.Bear;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LightAttackTest {

    private Bear bear1 = mock(Bear.class);
    private Bear bear2 = mock(Bear.class);

    public LightAttackTest() {
        when(bear1.display()).thenReturn("Bear1");
        when(bear2.display()).thenReturn("Bear2");
    }

    @Test
    void shouldLightBattleHurtOpponent() {
        //given
        Battle battle = new LightAttack();
        //when
        String fight = battle.fight(bear1, bear2);
        //then
        assertEquals( "Bear1 hurt Bear2",fight);
    }

}