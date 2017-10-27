package entity.memento;


import entity.Entity;
import entity.creature.Creature;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> undoList = new Stack<>();
    private Stack<Memento> redoList = new Stack<>();
    private Creature entity;
    private Memento temMemento;


    public void addMemento() {
        undoList.push(entity.saveStateToMemento());
    }

    public Memento getMemento(int index) {
        return undoList.get(index);
    }

    public void setEntity(Creature entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void undo() {
        if (!undoList.isEmpty()) {
            temMemento = undoList.pop();
            entity.setHealth(temMemento.getHealth());
            redoList.push(temMemento);
        }
    }

    public void redo() {
        if (redoList.isEmpty()) {

        } else {
            temMemento = redoList.pop();
            entity.setHealth(temMemento.getHealth());
            undoList.push(temMemento);
        }
    }
}
