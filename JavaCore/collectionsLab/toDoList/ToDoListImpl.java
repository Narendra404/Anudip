package collectionsLab.toDoList;

import java.util.Collections;
import java.util.List;

public class ToDoListImpl {

    private final ToDoList listObject;
    private final List<String> list;

    public ToDoListImpl() {
        listObject = new ToDoList();
        list = listObject.getList();
    }

    public void addTask(String task) {
        list.add(task);
    }

    public void removeTask(String task) {
        list.removeIf(var -> var.equalsIgnoreCase(task));
    }

    public void removeTask(Integer index) {
        list.removeIf(var -> var.equalsIgnoreCase(list.get(index)));
    }

    public void removeAllTasks() {
        for (String var : list) list.remove(var);
    }

    public void displayTasks() {

        System.out.println();
        System.out.println(listObject.getName());
        System.out.println();
        for (String var : list) System.out.println(" * " + var);
    }

    public void sortTasksByName() {
        Collections.sort(list);
    }

    public void setListName(String name) {
        listObject.setName(name);
    }

    public ToDoList getListObject() {
        return listObject;
    }
}
