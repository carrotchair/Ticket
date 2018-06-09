package pl.sdacademy.java.intermediate.programik;

import javax.xml.transform.Source;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoToEvaluator implements Evaluator {
    private final ProgramMemory programMemory;

    public GoToEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate(String string) {
        Pattern pattern = Pattern.compile("(\\d+) (.*)");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            String findNumber = matcher.group(1);
            int indexOf = programMemory.getOperationAdresses().indexOf(Integer.valueOf(findNumber));
            //zapisał do indexof
            programMemory.setIndeksAddress(indexOf);
            //ustawia mi index

//            String filedName = matcher.group(1);
//            String oldFiledValiable = matcher.group(2);
//            String filedValue = programMemory.getVariables().get(oldFiledValiable);
//            programMemory.getVariables().put(Integer.valueOf(filedName), filedValue);

        }
    }
}
