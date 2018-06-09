package pl.sdacademy.java.intermediate.programik;

class CalEvaluator implements Evaluator {
        private final ProgramMemory programMemory;

        public CalEvaluator(ProgramMemory programMemory) {
            this.programMemory = programMemory;
        }

        @Override
        public void evaluate(String string) {
            String regex = "\\s*(\\d+)\\s*([\\+\\-\\*\\/])\\s*(\\d+)\\s*";
        }
}
