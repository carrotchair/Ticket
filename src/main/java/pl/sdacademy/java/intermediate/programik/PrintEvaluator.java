package pl.sdacademy.java.intermediate.programik;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
class PrintEvaluator implements Evaluator {
    private static final String maker_char = "\\$";
    private final ProgramMemory programMemory;

    PrintEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    @Override
    public void evaluate(String value) {
        Pattern pattern = Pattern.compile(maker_char + "\\S+");
        Matcher matcher = pattern.matcher(value);

        while (matcher.find()) {
            String toReplace = matcher.group(1);
            log.debug("I found {} string to replace.", toReplace);
            String valueFromMemory = programMemory.getVariables().get(toReplace);
            log.debug("I found value {} for replacing.", valueFromMemory);
            if (valueFromMemory != null) {
                value = value.replaceFirst(maker_char + toReplace, valueFromMemory);
            }
        }
        System.out.println(value);
    }
}
