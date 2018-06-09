package pl.sdacademy.java.intermediate.programik;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProgramMemory {
    private Map<Integer, String> operations = new TreeMap<>();
    private Map<Integer, String> variables = new HashMap<>();

    public Map<Integer, String> getOperations() {
        return operations;
    }

    public Map<Integer, String> getVariables() {
        return variables;
    }
    //Map<Integer, String>
}
