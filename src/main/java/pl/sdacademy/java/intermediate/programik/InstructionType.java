package pl.sdacademy.java.intermediate.programik;

import java.util.function.Function;

enum InstructionType {
    PRINT((ProgramMemory programMemory) -> new PrintEvaluator(programMemory)),
    GET(programMemory -> {
        return new GetEvaluator(programMemory);
    }),
    SET(SetEvaluator::new),
    CAL(CalEvaluator::new),
    GOTO(GoToEvaluator::new);

    private final Function<ProgramMemory, Evaluator> evaluatorCreator;

    InstructionType(Function<ProgramMemory, Evaluator> evaluatorFunction) {
        this.evaluatorCreator = evaluatorFunction;
    }

    public Function<ProgramMemory, Evaluator> getEvaluatorCreator() {
        return evaluatorCreator;
    }
}
