package entity.human;

import behavior.human.Command;
import behavior.skill.Performable;
import entity.Entity;
import entity.creature.Product;
import entity.group.Group;

/**
 * Abstract Human Class
 * Implements Performable interface, allowing the Human to perform a specific action
 * */
public abstract class Human extends Entity implements Performable {

    private String name;
    private boolean gender;
    private double age;
    private Command command;

    /**
     * Constructors
     * */
    protected Human(String name, boolean gender) {
        this(name, gender, 28);
    }

    protected Human(String name, boolean gender, double age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.command = null;
    }


    /**
     * @return the name of the human
     * */
    public String getName() {
        return name;
    }

    /**
     * @return if the Human is male
     * */
    public boolean isMale() {
        return gender;
    }


    /**
     * @return the age of the Human
     * */
    public double getAge() {
        return age;
    }


    /**
     * Set a command for the person
     * @see Command
     * */
    public Human setCommand(Command command) {
        this.command = command;
        return this;
    }

    /**
     * Do command action method
     *
     * @return Group of the products expected, maybe null
     * */
    public Group<Product> doCommand() {
        return command.execute();
    }


    /**
     * Undo the command
     * */
    public void undoCommand() {
        command.undo();
    }

    /**
     * Redo the command
     * */
    public Group<Product> redoCommand() {
        return command.redo();
    }


    /**
     * Perform some actions
     * */
    @Override
    public void performAction() {

    }

}
