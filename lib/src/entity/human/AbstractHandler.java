package entity.human;

import entity.Entity;

abstract public class AbstractHandler extends Entity{
    //持有后继的责任对象
    protected AbstractHandler successor;
    //处理方法
    public abstract void handleRequest();
    //获取后继者
    public AbstractHandler getSuccessor() {
        return successor;
    }
    //设置后继者
    public void setSuccessor(AbstractHandler successor){
        this.successor = successor;
    }
}
