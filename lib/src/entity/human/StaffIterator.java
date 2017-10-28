package entity.human;

import java.util.List;

public class StaffIterator implements StaffIterable {

    private List<Staff> group;
    private int index;

    public StaffIterator(List<Staff> group) {
        this.group = group;
        index = -1;
    }

    @Override
    public boolean hasNext() {
        return (this.group != null) && (index + 1 < group.size());
    }

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
