package pl.sdacademy.java.intermediate.programik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramLoader {
    private final ProgramMemory programMemory;

    ProgramLoader(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }
    void load(String instruction) {
        String pattern = "(\\d+) (.*)";

        Pattern r = Pattern.compile(pattern);
        //Matcher m = r.matcher(line);
        Matcher m = r.matcher(instruction);

        if (((Matcher) m).find()) {
            programMemory.getOperations().put(Integer.parseInt(m.group(1)), m.group(2));
        }
    }
}
