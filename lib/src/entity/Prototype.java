package entity;

import application.Printable;

import java.util.HashMap;

public class Prototype implements Printable {

    private HashMap<String, Entity> map = new HashMap<>();

    protected Prototype() {

    }


    protected void addPrototype(String index, Entity entity) {
        map.put(index, entity);
    }

    public Entity getByPrototype(String index) {
        Entity entity = map.get(index);
        if (entity == null) {
            return null;
        }
        return (Entity) entity.clone();
    }

    protected Entity initPrototype(String name) {
        Entity entity = null;
        try {
            Class entityClass = Class.forName(name);
            entity = (Entity) entityClass.newInstance();

        } catch (ClassNotFoundException e) {
            print("No such class as " + name + ", check AnimalType/PlantType enumeration");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            print("Access Denied, Check Twice");
            e.printStackTrace();
        } catch (InstantiationException e) {
            print("Cannot instantiate, check constructor: " + name);
            e.printStackTrace();
        }
        return entity;
    }
}
