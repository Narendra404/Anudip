package collectionsLab.toDoList;

public class PriorityListElement<T> implements Comparable<PriorityListElement<T>> {

    private T element;
    private Integer priority;

    public PriorityListElement() {
        super();
    }

    public PriorityListElement(T element, Integer priority) {
        this.element = element;
        this.priority = priority;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityListElement o) {
        return this.getPriority() - o.getPriority();
    }
}
