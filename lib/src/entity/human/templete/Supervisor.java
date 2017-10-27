package entity.human.templete;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Staff {

    private List<Staff> under = new ArrayList<>();

    public Supervisor(String name, boolean sex) {
        super(name, sex);
    }

    public Supervisor(String name, boolean sex, double age) {
        super(name, sex, age);
    }

    public void employ(Staff staff) {
        under.add(staff);
        staff.setSupervisor(this);
    }

    protected List<Staff> getUnder() {
        return under;
    }

}
