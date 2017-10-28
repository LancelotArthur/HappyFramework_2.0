package entity.human;


import entity.human.templete.Employee;
import entity.human.templete.Staff;

public abstract class AbstractHandler extends Staff{
    //持有后继的责任对象
    protected AbstractHandler successor;
    //处理方法
    public abstract void handleRequest(int degree);
    //获取后继者
    public AbstractHandler getSuccessor() {
        return successor;
    }
    //设置后继者
    public void setSuccessor(AbstractHandler successor){
        this.successor = successor;
    }

    public AbstractHandler(String name, boolean sex) {
        super(name, sex);
    }
    public AbstractHandler(String name, boolean sex, double age) {
        super(name, sex, age);
    }
}
