package entity.memento;


import entity.Entity;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> undoList = new Stack<Memento>();
    private Stack<Memento> redoList = new Stack<Memento>();
    private Entity entity;
    private Memento temMemento;


    public void addMemento() {
        undoList.push(entity.saveStateToMemento());
    }

    public Memento getMemento(int index) {
        return undoList.get(index);
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void undo() {
        if (undoList.isEmpty()) {
            return;
        } else {
            temMemento = undoList.pop();
            entity.setState(temMemento.getState());
            redoList.push(temMemento);
        }
    }

    public void redo() {
        if (redoList.isEmpty()) {

        } else {
            temMemento = redoList.pop();
            entity.setState(temMemento.getState());
            undoList.push(temMemento);
        }
    }
}
