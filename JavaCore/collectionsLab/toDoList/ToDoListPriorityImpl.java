package collectionsLab.toDoList;

import java.util.Collections;
import java.util.List;

public class ToDoListPriorityImpl {

    private final ToDoListPriority<String> listObject;
    private final List<PriorityListElement<String>>  list;

    public ToDoListPriorityImpl() {

        listObject = new ToDoListPriority<>();
        list = listObject.getList();
    }

    public void addTask(String task, Integer priority) {
        listObject.getList().add(new PriorityListElement<>(task, priority));
    }

    public void removeTask(String task) {

        for (PriorityListElement<String> priorityListElement : list) {

            String taskString = priorityListElement.getElement();

            if (taskString.equalsIgnoreCase(task)) {
                list.remove(priorityListElement);
            }
        }
    }

    public void removeTask(Integer priority) {

        for (PriorityListElement<String> priorityListElement : list) {

            Integer taskPriority = priorityListElement.getPriority();

            if (taskPriority.equals(priority)) {
                list.remove(priorityListElement);
            }
        }
    }

    private void sortTasks() {
        Collections.sort(list);
    }

    public void displayTasks() {

        sortTasks();
        System.out.println();
        System.out.println(listObject.getName());
        System.out.println();
        for (PriorityListElement<String> listElement : list) {
            System.out.printf(" %d %s\n", listElement.getPriority(), listElement.getElement());
        }
    }

    public void removeAllTasks() {

        for (PriorityListElement<String> listElement : list){
           list.remove(listElement);
        }
    }

    public void setListName(String name) {
        listObject.setName(name);
    }

    public ToDoListPriority<String> getListObject() {
        return listObject;
    }
}
