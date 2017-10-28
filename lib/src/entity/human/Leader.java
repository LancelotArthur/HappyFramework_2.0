package entity.human;

import java.util.ArrayList;
import java.util.List;

public class Leader extends Staff {

    static final Leader BOSS = new Leader();

    private List<Staff> subordinates = new ArrayList<>();

    private Leader(){
        super();
    }
    public Leader(String name, boolean gender) {
        super(name, gender);
    }

    public Leader(String name, boolean gender, double age) {
        super(name, gender, age);
    }

    List<Staff> getList(){
        return subordinates;
    }

    public boolean employ(Staff staff) {
        staff.setLeaderDirectly(this);
        return subordinates.add(staff);
    }

    public boolean fire(Staff staff) {
        return subordinates.remove(staff);

    }

    public StaffIterator getSubordinates() {
        return new StaffIterator(this.subordinates);
    }

}
