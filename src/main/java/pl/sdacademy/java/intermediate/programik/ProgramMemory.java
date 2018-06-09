package pl.sdacademy.java.intermediate.programik;

import java.util.*;

public class ProgramMemory {
    private Map<Integer, String> operations = new TreeMap<>();
    private Map<Integer, String> variables = new HashMap<>();
    private List<Integer> operationAdresses = new ArrayList<>();
    //int i;

    public Map<Integer, String> getOperations() {
        return operations;
    }

    public Map<Integer, String> getVariables() {
        return variables;
    }

    private int i = 0;
    public boolean hasNextOperation() {
        return i < operationAdresses.size();
    }

    public String getNextOperation() {
        Integer address = operationAdresses.get(i);
        i++;
        return operations.get(address);
    }

    //int j = 0;


    public void setIndeksAddress(int i) {
        this.i = i;
    }

    public List<Integer> getOperationAdresses() {
        return operationAdresses;
    }



}
