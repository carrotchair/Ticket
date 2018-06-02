package pl.sdacademy.java.intermediate.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private int number;

    @Test
    void shouldReturnOneIsNumberIsOne() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String value = fizzBuzz.playGame(1);
        //then
        assertEquals("1", value);
    }


    @Test
    void shouldReturnFizzIfValueIs3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String value = fizzBuzz.playGame(6);
        //then
        assertEquals("Fizz", value);
    }

    @Test
    void shouldReturnFizzIfValueIs5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String value = fizzBuzz.playGame(10);
        //then
        assertEquals("Buzz", value);
    }

    @Test
    void shouldReturnFizzIfValueIs3And5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String value = fizzBuzz.playGame(15);
        //then
        assertEquals("FizzBuzz", value);
    }

    @Test
    void shouldReturnSomething() {
        String line = "ggg321 222 ghghg";
        String pattern = "(\\d+) (.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);

        if (((Matcher) m).find()) {
            System.out.println("Found value " + m.group(0));
            System.out.println("Found value " + m.group(1));
            System.out.println("Found value " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
    }

    /*
        @Test
    void name() {
        //given
        //when
        //then
    }
     */
}