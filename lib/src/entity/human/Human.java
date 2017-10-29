package entity.human;

import behavior.human.Command;
import behavior.skill.Performable;
import entity.Entity;
import entity.creature.Product;
import entity.group.Group;

public abstract class Human extends Entity implements Performable {

    private String name;
    private boolean gender;
    private double age;
    private Command command;

    Human(String name, boolean gender) {
        this(name, gender, 28);
    }

    Human(String name, boolean gender, double age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.command = null;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return gender;
    }

    public double getAge() {
        return age;
    }


    public void setCommand(Command command) {
        this.command = command;
    }

    public Group<Product> doCommand() {
        return command.execute();
    }

    public void undoCommand() {
        command.undo();
    }

    public Group<Product> redoCommand() {
        return command.redo();
    }

    @Override
    public void performAction() {

    }

}
