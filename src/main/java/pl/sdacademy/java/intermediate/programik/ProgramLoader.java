package pl.sdacademy.java.intermediate.programik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProgramLoader {
    private final ProgramMemory programMemory;

    ProgramLoader(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }
    void load(String instruction) {
        String regex = "(\\d+) (.*)"; //"(.\\S+) (.*)"

        Pattern pattern = Pattern.compile(regex);
        //Matcher m = r.matcher(line);
        Matcher matcher = pattern.matcher(instruction);

        if (matcher.find()) {
            Integer key = Integer.parseInt(matcher.group(1));
            String value = matcher.group(1);
            programMemory.getOperations().put(key, value);
        }
    }
}
