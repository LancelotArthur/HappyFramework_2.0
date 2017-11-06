package scene;

import application.Printable;
import entity.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/**
 * The Abstract Scene class
 * Implements the Serializable interface, so that the scenes can be save in files
 * Implements the Actionable interface
 *
 * @see scene.Actionable
 * @see application.Director
 */
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

    /**
     * Add a child to the scene.
     *
     * @param entity the entity to be added into the scene
     * @return the key of the child
     */
    public Long addChild(Entity entity) {
        Long key = entity.getId();
        children.put(key, entity);
        return key;
    }

    /**
     * Get a child by its key
     *
     * @param key the key of the child demanded
     * @return the specified child, null if not existent.
     */
    public Entity getChildById(Long key) {
        return children.get(key);
    }


    /**
     * Remove a child with a specified key
     *
     * @param key the key of the child to delete
     * @return the child deleted from the scene
     * */
    public Entity removeChild(Long key) {
        return children.remove(key);
    }

    /**
     * @return A collection of all children in a scene
     * */
    public Collection<Entity> getAllChildren() {
        return children.values();
    }


    /**
     * Remove all children in a scene
     * */
    public void clearChildren() {
        children.clear();
    }


    /**
     * @return the name of the scene
     * */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * @return the id of the scene
     * */
    public long getId() {
        return id;
    }


    /**
     * Used when the scene is loaded from a file.
     * the entities saved in the scene should be assigned a new id value.
     * */
    public void refreshIndex() {
        HashMap<Long, Entity> newMap = new HashMap<>();
        for (Entity child : children.values()) {
            Entity entity = (Entity) child.clone();
            newMap.put(entity.getId(), entity);
        }
        children = newMap;
    }


}
