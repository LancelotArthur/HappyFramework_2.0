package entity.human;

public abstract class Staff extends Human{

    private Leader leader;

    protected Staff(){
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

    public StaffIterator getColleagues(){
        if (this.leader == null){
            print("I am Boss.");
            return null;
        }
        return this.leader.getSubordinates();
    }

}
