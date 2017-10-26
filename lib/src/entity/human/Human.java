package entity.human;

import behavior.Performable;
import behavior.human.Commandable;
import entity.Entity;

public abstract class Human extends Entity implements Performable {

    protected String name;
    protected boolean sex;
    protected double age;
    protected Commandable command;

    protected Human(String name, boolean sex) {
        this(name, sex, 28);
    }

    protected Human(String name, boolean sex, double age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.command = null;
    }

    public void setCommand(Commandable command) {
        this.command = command;
    }

    public Commandable getCommand() {
        return command;
    }

    public void doCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }

    public void redoCommand() {
        command.redo();
    }

    @Override
    public void performAction() {

    }

}
