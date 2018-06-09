package pl.sdacademy.java.intermediate.programik;

class Program {
    public static void main(String[] args) {
        ProgramMemory programMemory = new ProgramMemory();
        ProgramLoader programLoader = new ProgramLoader(programMemory);
        programLoader.load("9 SET name Przemek");
        programLoader.load("10 SET name2 Gienio");
        programLoader.load("11 GET name4 name");
        programLoader.load("12 PRINT hello");
        programLoader.load("13 PRINT hello2");
        programLoader.load("14 PRINT hello kdfjs");
        programLoader.load("15 PRINT hello $name2 jest kolega $name $name");
        programLoader.load("16 PRINT hello $name4");
        programLoader.load("17 CAL 3+6");
        programLoader.load("17 GOTO 12");
        ProgramEvaluator programEvaluator = new ProgramEvaluator(programMemory);
        programEvaluator.evaluate();
    }
}
