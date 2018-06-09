package pl.sdacademy.java.intermediate.programik;

import lombok.extern.log4j.Log4j2;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
class ProgramEvaluator {
    private final ProgramMemory programMemory;

    ProgramEvaluator(ProgramMemory programMemory) {
        this.programMemory = programMemory;
    }

    void evaluate() {
        //Map<Integer, String> operations = programMemory.getOperations();
        while (programMemory.hasNextOperation()) {
            String instruction = programMemory.getNextOperation();
            evaluateInstruction(instruction);
        }
//        for (Map.Entry<Integer, String> integerStringEntry : operations.entrySet()) { //34 PRINT Hej
//            String instruction = integerStringEntry.getValue(); //PRINT Hej
//            evaluateInstruction(instruction);
//        }
    }

    private void evaluateInstruction(String instruction) {
        Pattern pattern = Pattern.compile("([A-Z]+) (.*)");
        Matcher matcher = pattern.matcher((CharSequence) instruction);
        if (matcher.find()) {
            String instructionType = matcher.group(1);
            String arguments = matcher.group(2);
            try {
                InstructionType type = InstructionType.valueOf(instructionType);
//                Evaluator evaluator = type.getEvaluatorCreator().apply(programMemory);
                Evaluator evaluator = EvaluatorBuilder.createEvaluator(type, programMemory);
                evaluator.evaluate(arguments);
            } catch (IllegalArgumentException e) {
                log.warn("Instruction of type {} is not found. ", instructionType);
            }
        }
    }
}
