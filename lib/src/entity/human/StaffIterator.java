package entity.human;

import java.util.List;


/**
 * The iterator class
 * */
public class StaffIterator implements StaffIterable {

    private List<Staff> group;
    private int index;

    /**
     * Constructor
     * */
    public StaffIterator(List<Staff> group) {
        this.group = group;
        index = -1;
    }


    /**
     * @return if the collection has another element
     * */
    @Override
    public boolean hasNext() {
        return (this.group != null) && (index + 1 < group.size());
    }

    /**
     * @return the next element
     * */
    @Override
    public Staff next() {
        if (hasNext()) {
            index++;
            return group.get(index);
        } else {
            return null;
        }
    }
}
