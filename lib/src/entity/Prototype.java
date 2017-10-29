package entity;

import application.Printable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

public class Prototype implements Printable {

    private static volatile Prototype instance;
    private HashMap<String, Entity> map = new HashMap<>();

    private Prototype() {
        Collection<String> types = supportedClasses().stringPropertyNames();
        for (String type : types) {
            String name = supportedClasses().getProperty(type);
            Entity entity = initPrototype(name);
            if (entity != null) {
                addPrototype(type, entity);
            }
        }
    }

    private static Properties supportedClasses() {
        Properties properties = new Properties();
        try {
            File directory = new File("");
            File file = new File(directory.getCanonicalPath(), "lib/properties/prototypes.properties");
            properties.load(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private Entity initPrototype(String name) {
        Entity entity = null;
        try {
            Class entityClass = Class.forName(name);
            entity = (Entity) entityClass.newInstance();

        } catch (ClassNotFoundException e) {
            print("No such class as " + name + ", check properties file");
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

    private void addPrototype(String index, Entity entity) {
        map.put(index, entity);
    }

    public static Prototype getInstance() {
        if (instance == null) {
            synchronized (Prototype.class) {
                if (instance == null) {
                    instance = new Prototype();
                }
            }
        }
        return instance;
    }

    public Entity getByPrototype(String index) {
        index = index.substring(0, 1).toUpperCase() + index.substring(1).toLowerCase();
        Entity entity = null;
        if (map.containsKey(index)) {
            entity = map.get(index);
        } else {
            String path = supportedClasses().getProperty(index);
            if (map.containsKey(path))
                entity = map.get(path);
        }
        if (entity == null) {
            return null;
        }
        return (Entity) entity.clone();
    }
}
