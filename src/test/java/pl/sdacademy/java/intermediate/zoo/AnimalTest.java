package pl.sdacademy.java.intermediate.zoo;

import org.junit.jupiter.api.Test;

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
        Animal teddyBear = new TeddyBear();
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
}