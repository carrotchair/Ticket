package pl.sdacademy.java.intermediate.Calendar;

import javax.xml.bind.JAXB;
import java.io.File;
import java.util.List;

public class TodosXmlRep implements TodosRep {

    private final Todos todos;
    private final File file;

    TodosXmlRep(File file) {
        //File xml = new File("src\\main\\resources\\event_db.xml");
        this.file = file;
        this.todos = JAXB.unmarshal(file, Todos.class);
    }

    @Override
    public List<TodoOne> getAllTodoList() {
        return null;
    }

    @Override
    public Events getNextTodo() {
        return null;
    }

    @Override
    public void addTodo(TodoOne todoOne) {
        todos.getTodosList().add(todoOne);
    }

    @Override
    public void save(TodoOne todoOne) {
        JAXB.marshal(todos, file);
    }
}
