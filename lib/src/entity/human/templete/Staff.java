package entity.human.templete;

import entity.human.Human;

public class Staff extends Human {

    protected Supervisor supervisor = null;

    public Staff(String name, boolean sex) {
        super(name, sex);
    }

    public Staff(String name, boolean sex, double age) {
        super(name, sex, age);
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public ColleagueIterator iterator() {
        if (this.supervisor == null) {
            print("Boss has no colleague. Nothing will be iterated.");
            return null;
        }
        return new ColleagueIterator(this.supervisor.getUnder());
    }

}
