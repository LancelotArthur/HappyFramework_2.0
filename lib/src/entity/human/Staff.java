package entity.human;


/**
 * Abstract Staff Class,
 * inherited by Leader and Farmhand
 * @see Leader
 * @see Farmhand
 * */
public abstract class Staff extends Human{

    private Leader leader;


    Staff() {
        super("BOSS",true, Integer.MAX_VALUE);
    }

    Staff(String name, boolean gender) {
        super(name, gender);
        leader= Leader.BOSS;
        Leader.BOSS.employ(this);
    }

    Staff(String name, boolean gender, double age) {
        super(name, gender, age);
        leader= Leader.BOSS;
        Leader.BOSS.employ(this);
    }


    void setLeader(Leader leader) {
        this.leader.fire(this);
        leader.employ(this);
        this.leader = leader;
    }
    void setLeaderDirectly(Leader leader){
        this.leader = leader;
    }

    /**
     * Get an iterator of the colleagues of the staff
     *
     * @return the iterator of the colleagues of this staff
     * */
    public StaffIterator getColleagues(){
        if (this.leader == null){
            print("I am Boss.");
            return null;
        }
        return this.leader.getSubordinates();
    }

}
