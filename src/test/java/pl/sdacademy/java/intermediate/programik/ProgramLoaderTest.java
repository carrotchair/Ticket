package pl.sdacademy.java.intermediate.programik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramLoaderTest {

    @Test
    void shouldName() {
        //given
        ProgramMemory programMemory = new ProgramMemory();
        ProgramLoader programLoader = new ProgramLoader(programMemory);
        //when
        programLoader.load("10 PRINT Hello World");
        //then
        String s = programMemory.getOperations().get(10);
        assertEquals("PRINT Hello World", s);
    }

//    @Test
//    void shouldReturnSomething() {
//        String line = "ggg321 222 ghghg";
//        String pattern = "(\\d+) (.*)";
//
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(line);
//
//        if (((Matcher) m).find()) {
//            System.out.println("Found value " + m.group(0));
//            System.out.println("Found value " + m.group(1));
//            System.out.println("Found value " + m.group(2));
//        } else {
//            System.out.println("NO MATCH");
//        }

}