package pl.sdacademy.java.intermediate.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void shouldBearBeDeadWhenHPIs0() {
        //given
        Bear bear = new PolarBear();
        //when
        bear.setHp(0);
        //then
        assertFalse(bear.isAlive());
    }

    @Test
    void shouldBearBeAliveWhenHPIs50() {
        //given
        Bear bear = new PolarBear();
        //when
        bear.setHp(50);
        //then
        assertTrue(bear.isAlive());
    }

}