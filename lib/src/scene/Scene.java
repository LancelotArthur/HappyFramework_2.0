package scene;

import application.Printable;
import entity.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

public abstract class Scene implements Printable, Actionable, Serializable {

    private static final long serialVersionUID = 321498770673451267L;
    private static long index = 0;
    private long id;
    private String sceneName;
    private HashMap<Long, Entity> children = new HashMap<>();

    protected Scene() {
        this("Default_" + index);
    }

    protected Scene(String name) {
        sceneName = name;
        id = index++;
    }

    public Long addChild(Entity entity) {
        Long key = entity.getId();
        children.put(key, entity);
        return key;
    }

    public Entity getChildById(Long key) {
        return children.get(key);
    }

    public Entity removeChild(Long key) {
        return children.remove(key);
    }

    public Collection<Entity> getAllChildren() {
        return children.values();
    }

    public void clearChildren() {
        children.clear();
    }

    public String getSceneName() {
        return sceneName;
    }

    public long getId() {
        return id;
    }


}
