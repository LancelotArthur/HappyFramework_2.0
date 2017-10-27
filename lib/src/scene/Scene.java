package scene;

import application.Director;
import application.Printable;
import entity.Entity;

import java.util.Collection;
import java.util.HashMap;

public abstract class Scene implements Printable, Actionable {

    private static long id = 0;
    //中介者
    protected Director mediator;
    private String sceneName;
    private HashMap<String, Entity> children;
    //可直接设置中介者
    public Scene(Director mediator) {
        this.mediator = mediator;
    }
    protected Scene() {
        sceneName = "Default";
    }

    protected Scene(String name) {
        sceneName = name;
    }

    //在抽象同事类中添加用于与中介者取得联系（即注册）的方法
    public void setMediator(Director mediator) {
        this.mediator = mediator;
    }

    public String addChild(Entity entity) {
        String key = entity.getClass().toString() + " " + id++;
        children.put("" + key, entity);
        return key;
    }

    public Entity removeChild(String key) {
        return children.remove(key);
    }

    public Collection<Entity> getAllChildren() {
        return children.values();
    }

    public void clearChildren() {
        children.clear();
    }

}
