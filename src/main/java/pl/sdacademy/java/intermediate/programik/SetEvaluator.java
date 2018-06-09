package pl.sdacademy.java.intermediate.programik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SetEvaluator implements Evaluator {
    private final ProgramMemory programMemory;

    public SetEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void  evaluate(String string) {
        Pattern pattern = Pattern.compile("(.\\S+) (.*)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            String filledName = matcher.group(1);
            String filledValue = matcher.group(2);
            programMemory.getVariables().put(Integer.valueOf(filledName), filledValue);

        }
    }
}
