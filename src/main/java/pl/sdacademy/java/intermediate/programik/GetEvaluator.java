package pl.sdacademy.java.intermediate.programik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GetEvaluator implements Evaluator {
    private final ProgramMemory programMemory;

    public GetEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void  evaluate(String string) {
        Pattern pattern = Pattern.compile("(.\\S+) (.\\S+)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            String filedName = matcher.group(1);
            String oldFiledValiable = matcher.group(2);
            String filedValue = programMemory.getVariables().get(oldFiledValiable);
            programMemory.getVariables().put(Integer.valueOf(filedName), filedValue);

        }
    }
}
