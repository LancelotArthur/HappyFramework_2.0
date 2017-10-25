package entity;

import application.Printable;
import entity.animal.behavior.Transformable;
import entity.animal.template.Dog;
import entity.plant.template.AppleTree;

public class Transform<T, S> implements Transformable<S>, Printable {

    private T rootEntity;
    private S currentEntity;

    public Transform(T entity) {
        this.rootEntity = entity;
    }

    @Override
    public String getCurrentEntity() {
        String typeName = getTrunctedName(rootEntity.getClass().getSimpleName());
        if (this.currentEntity != null){
             typeName = getTrunctedName(currentEntity.getClass().toString());
             print("I'm " + typeName + " now!");
             return currentEntity.getClass().toString();
        }
        print("I'm still" + typeName + " .");
        return rootEntity.getClass().getSimpleName();
    }

    @Override
    public boolean transform(S newEntity) {
        this.currentEntity = newEntity;
        return  (this.currentEntity != null);
    }

    @Override
    public String getPreviousEntity() {
        String typeName = getTrunctedName(rootEntity.getClass().getSimpleName());
        print("I was " + typeName + " before.");
        return rootEntity.getClass().getSimpleName();
    }

    private static String getTrunctedName(String fullClassName) {
        String[] splited = fullClassName.split("\\.");
        return splited[splited.length - 1];
    }

}