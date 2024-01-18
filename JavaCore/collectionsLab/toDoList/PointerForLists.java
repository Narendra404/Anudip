package collectionsLab.toDoList;

public class PointerForLists {

    private Integer index;
    private Boolean isPriority;

    public PointerForLists() {
        index = null;
        isPriority = null;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getPriority() {
        return isPriority;
    }

    public void setPriority(Boolean priority) {
        isPriority = priority;
    }
}
