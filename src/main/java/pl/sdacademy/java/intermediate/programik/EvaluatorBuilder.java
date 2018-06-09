package pl.sdacademy.java.intermediate.programik;

public class EvaluatorBuilder {
    public static Evaluator createEvaluator(InstructionType type, ProgramMemory programMemory) {
        Evaluator evaluator;
        switch (type) {
            case PRINT:
                evaluator = new PrintEvaluator(programMemory);
                break;
            case SET:
                evaluator = new SetEvaluator(programMemory);
                break;
            case GET:
                evaluator = new GetEvaluator(programMemory);
                break;
            case CAL:
                evaluator = new CalEvaluator(programMemory);
                break;
            case GOTO:
                evaluator = new GoToEvaluator(programMemory);
                break;
            default:
                Evaluator emptyEvaluator = new EmptyEvaluator();
//                Evaluator emptyEvaluator2 = (string)->{}; to samo co wyzej
                evaluator = emptyEvaluator;
        }
        return evaluator;
    }
}