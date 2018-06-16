package pl.sdacademy.java.intermediate.Calendar;

import java.util.List;

public interface TodosRep {

    List<TodoOne> getAllTodoList();
    Events getNextTodo();
    void addTodo (TodoOne todoOne);
    void save (TodoOne todoOne);

}
