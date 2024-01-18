package collectionsLab.toDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoListPriority <T> {

    private List<PriorityListElement<T>> list;
    private String name;

    public ToDoListPriority() {

        list = new ArrayList<>();
        name = null;
    }

    public List<PriorityListElement<T>> getList() {
        return list;
    }

    public void setList(List<PriorityListElement<T>> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}