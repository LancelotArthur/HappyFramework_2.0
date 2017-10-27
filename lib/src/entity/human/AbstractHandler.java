package entity.human;

import entity.Entity;

abstract public class AbstractHandler extends Entity{

    protected AbstractHandler successor;

    public abstract void handleRequest();

    public AbstractHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractHandler successor){
        this.successor = successor;
    }
}
