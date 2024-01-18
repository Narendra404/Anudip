package collectionsLab.toDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<String> list;
    private String name;

    public ToDoList() {
        list = new ArrayList<>();
        name = null;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
