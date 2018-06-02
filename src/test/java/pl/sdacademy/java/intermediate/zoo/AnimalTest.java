package pl.sdacademy.java.intermediate.zoo;

import org.junit.jupiter.api.Test;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.Battle;
import pl.sdacademy.java.intermediate.zoo.FatalAttack.FatalAttack;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class AnimalTest {
    @Test
    void shouldBearBeAlive() throws IDontEatException {
        //given
        Animal animal = new BrowBear();
        //when
        animal.eat();
        //then
        assertTrue(animal.isAlive());
    }

    @Test
    void shouldBeDeadIfNotEatSince11Days() {
        //given
        Animal animal = spy(new BrowBear());

        //when
        LocalDate elevenDaysBefore = LocalDate.now()
                .minus(11, DAYS);
        when(animal.getLastEatTime()).thenReturn(elevenDaysBefore);
        //then
        assertFalse(animal.isAlive());
    }

    @Test
    void shouldThrowExceptionWhenTryToFeedTeddyBear() {
        //given
        Animal teddyBear = new TeddyBear() {
            @Override
            public String display() {
                return null;
            }
        };
        //then
        assertThrows(IDontEatException.class, teddyBear::eat);
    }

    @Test
    void shouldWeightBe100IfBearIsBrowBear() {
        //given
        Bear bear = new BrowBear();
        //then
        assertEquals(bear.getWeight(), 100);
    }

    @Test
    void shouldWeightBe200IfBearIsPolarBear() {
        //given
        Bear bear = new PolarBear();
        //then
        assertEquals(bear.getWeight(), 200);
    }

    @Test
    void shouldWeightBe50IfBearIsBlackBear() {
        //given
        Bear bear = new BlackBear();
        //then
        assertEquals(bear.getWeight(), 50);
    }

    @Test
    void shouldDisplayNameOfBlackBearIfBlackMINE() {
        //given
        Bear bear = new BlackBear();
        //then
        String name = bear.display();
        assertEquals(name, "BlackBear");
    }

    @Test
    void shouldDisplayNameOfBlackBearIfBlack() {
        //given
        Bear bear = new BlackBear();
        //then
        String name = bear.display();
        assertEquals(name, "BlackBear");
    }
}