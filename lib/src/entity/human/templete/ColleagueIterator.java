package entity.human.templete;

import entity.human.ColleagueIterable;

import java.util.List;

public class ColleagueIterator implements ColleagueIterable {

    public ColleagueIterator(List<Staff> under) {
        this.under = under;
        index = -1;
    }

    private List<Staff> under;
    private int index;

    @Override
    public boolean hasNextColleague() {
        return (this.under != null) && (index + 1 < under.size());
    }

    @Override
    public Staff nextColleague() {
        if (hasNextColleague()) {
            index++;
            return under.get(index);
        } else {
            return null;
        }

    }
}
