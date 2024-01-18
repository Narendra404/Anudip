package collectionsLab.toDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private final Scanner scanner;
    private final List<ToDoListImpl> simpleList;
    private final List<ToDoListPriorityImpl> priorityList;
    private final PointerForLists pointer;

    public App() {

        scanner = new Scanner(System.in);
        simpleList = new ArrayList<>();
        priorityList = new ArrayList<>();
        pointer = new PointerForLists();
    }

    public String inputTask() {

        scanner.nextLine();
        System.out.print("\nEnter the task : ");

        return scanner.nextLine();
    }

    public Integer inputPriority() {

        System.out.print("\nEnter the priority of the task : ");

        return scanner.nextInt();
    }

    private Boolean isPresent(String listName, Boolean isPriority) {

        if (isPriority) {
            for (ToDoListPriorityImpl var : priorityList) {
                if (var.getListObject().getName().equals(listName)) {
                    return Boolean.TRUE;
                }
            }
        } else {
            for (ToDoListImpl var : simpleList) {
                if (var.getListObject().getName().equals(listName)) {
                    return Boolean.TRUE;
                }
            }
        }

        return Boolean.FALSE;
    }

    private String inputListName(Boolean isPriority) {

        String name;

        scanner.nextLine();
        do {
            System.out.print("\nEnter the name of the new list [should not be a name of an existing list] : ");
            name = scanner.nextLine();
        } while (isPresent(name, isPriority));

        return name;
    }

    private Integer findListIndex(String listName, Boolean isPriority) {

        if (isPriority) {
            for (ToDoListPriorityImpl var : priorityList) {
                if (var.getListObject().getName().equals(listName)) {
                    return priorityList.indexOf(var);
                }
            }
        } else {
            for (ToDoListImpl var : simpleList) {
                if (var.getListObject().getName().equals(listName)) {
                    return simpleList.indexOf(var);
                }
            }
        }

        return -1;
    }

    private void displayAllLists() {

        System.out.println("\n\t\tAll lists");

        System.out.println("\n\tPriority lists");
        System.out.println("\nList name\tNumber of Tasks\n");
        for (ToDoListPriorityImpl var : priorityList) {
            System.out.println(var.getListObject().getName() + "\t\t\t" + var.getListObject().getList().size());
        }

        System.out.println("\n\tSimple lists");
        System.out.println("\nList name\tNumber of Tasks\n");
        for (ToDoListImpl var : simpleList) {
            System.out.println(var.getListObject().getName() + "\t\t\t" + var.getListObject().getList().size());
        }
    }

    public void help() {

        System.out.println("\n\t\tHelp\n");
        System.out.println("a : add new task");
        System.out.println("d : delete a task");
        System.out.println("s : display the list");
        System.out.println("n : create new list");
        System.out.println("x : delete a list");
        System.out.println("b : show all lists");
        System.out.println("q : exit");
    }

    public void control() {

        char choice;
        System.out.println("\n\t\tWelcome to the List App\n");
        System.out.println("Enter 'h' for help.");
        do {
            choice = scanner.next().charAt(0);

            switch (choice) {

                case 'h' -> help();
                case 'a' -> {
                    try {
                        if (pointer.getPriority()) {
                            System.out.println("\nAdding a task ...");
                            priorityList.get(pointer.getIndex()).addTask(inputTask(), inputPriority());
                            System.out.println("\nTask added!");
                        } else {
                            System.out.println("\nAdding a task ...");
                            simpleList.get(pointer.getIndex()).addTask(inputTask());
                            System.out.println("\nTask added!");
                        }
                    } catch (NullPointerException ignored) {
                        System.out.println("\nNo list created. \nCreate a new list by entering 'n'.");
                    }
                }
                case 'd' -> {
                    try {

                        if (pointer.getPriority()) {

                            System.out.println("\nDeleting a task ...");
                            System.out.println("\nDelete using task priority. (1)");
                            System.out.println("Delete using task content. (Default : anything other than 1)");
                            System.out.print("\nEnter your choice : ");

                            if (scanner.nextInt() == 1) {
                                priorityList.get(pointer.getIndex()).removeTask(inputPriority());
                            } else {
                                priorityList.get(pointer.getIndex()).removeTask(inputTask());
                            }

                            System.out.println("\nTask(s) deleted!");
                        } else {

                            System.out.println("\nDeleting a task ...");
                            simpleList.get(pointer.getIndex()).addTask(inputTask());
                            System.out.println("\nTask deleted!");
                        }
                    } catch (NullPointerException ignored) {
                        System.out.println("\nNo list created. \nCreate a new list by entering 'n'.");
                    }
                }
                case 's' -> {

                    try {

                        if (pointer.getPriority()) {

                            System.out.println("\nDisplaying the list ...");
                            priorityList.get(pointer.getIndex()).displayTasks();
                            System.out.println("\nThe list is displayed!");
                        } else {

                            System.out.println("\nDisplaying the list ...");
                            simpleList.get(pointer.getIndex()).displayTasks();
                            System.out.println("\nThe list is displayed!");
                        }
                    } catch (NullPointerException ignored) {
                        System.out.println("\nNo list created. \nCreate a new list by entering 'n'.");
                    }
                }
                case 'n' -> {

                    System.out.println("\nCreating a new list ...");
                    System.out.println("\nCreate a new priority list. (1)");
                    System.out.println("Create a new simple list. (Default : anything other than 1)");
                    System.out.print("\nEnter your choice : ");

                    if (scanner.nextInt() == 1) {

                        ToDoListPriorityImpl obj = new ToDoListPriorityImpl();
                        obj.setListName(inputListName(Boolean.TRUE));
                        priorityList.add(obj);
                        pointer.setIndex(findListIndex(obj.getListObject().getName(), Boolean.TRUE));
                        pointer.setPriority(Boolean.TRUE);
                    }
                    else {

                        ToDoListImpl obj = new ToDoListImpl();
                        obj.setListName(inputListName(Boolean.FALSE));
                        simpleList.add(obj);
                        pointer.setIndex(findListIndex(obj.getListObject().getName(), Boolean.FALSE));
                        pointer.setPriority(Boolean.FALSE);
                    }

                    System.out.println("\nList created!");
                }

                case 'x' -> {

                    displayAllLists();

                    System.out.print("\nThe list to be deleted is a Priority list (y/n) : ");

                    if (scanner.next().charAt(0) == 'y') {

                        String name;

                        do {
                            System.out.print("\nEnter the name of the list [The name should be present in the Priority list] : ");
                            name = scanner.nextLine();
                        } while (!isPresent(name, Boolean.TRUE));

                        priorityList.remove(priorityList.get(findListIndex(name, Boolean.TRUE)));
                    }
                    else {

                        String name;

                        do {
                            System.out.println("\nEnter the name of the list [The name should be present in the Simple list] : ");
                            name = scanner.nextLine();
                        } while (!isPresent(name, Boolean.FALSE));

                        simpleList.remove(simpleList.get(findListIndex(name, Boolean.FALSE)));
                    }

                    System.out.println("\nList deleted!");
                }

                case 'b' -> {

                    displayAllLists();

                    System.out.print("\nWant to select a new list (y/n) : ");

                    if (scanner.next().charAt(0) == 'y') {

                        System.out.print("\nThe list to be selected is a Priority list (y/n) : ");
                        scanner.nextLine();
                        if (scanner.next().charAt(0) == 'y') {

                            String name;

                            do {
                                System.out.print("\nEnter the name of the list [The name should be present in the Priority list] : ");
                                name = scanner.nextLine();
                            } while (!isPresent(name, Boolean.TRUE));

                            pointer.setPriority(Boolean.TRUE);
                            pointer.setIndex(findListIndex(name, Boolean.TRUE));
                        }
                        else {

                            String name;

                            do {
                                System.out.println("\nEnter the name of the list [The name should be present in the Simple list] : ");
                                name = scanner.nextLine();
                            } while (!isPresent(name, Boolean.FALSE));

                            pointer.setPriority(Boolean.FALSE);
                            pointer.setIndex(findListIndex(name, Boolean.FALSE));
                        }
                    }

                    System.out.println("\nThe lists have been displayed!");
                }
            }
        } while (choice != 'q');
    }

    public static void main(String[] args) {
        new App().control();
    }
}
