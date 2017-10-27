package entity;

import application.Printable;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Properties;


public class Factory implements Printable {

    private static Properties supportedClasses() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("lib/properties/factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private final static HashMap<Class,Class> CLASS_HASH_MAP = new HashMap<>();
    static {
        CLASS_HASH_MAP.put(Integer.class, int.class);
        CLASS_HASH_MAP.put(Double.class, double.class);
        CLASS_HASH_MAP.put(Float.class, float.class);
        CLASS_HASH_MAP.put(Short.class, short.class);
        CLASS_HASH_MAP.put(Long.class, long.class);
        CLASS_HASH_MAP.put(Byte.class, byte.class);
        CLASS_HASH_MAP.put(Boolean.class, boolean.class);
        CLASS_HASH_MAP.put(Character.class, char.class);
    }


    public Entity create(String type){

        return create(type, new Object[]{});
    }

    public Entity create(String type, Object[] propertiesValue){
        Class[] propertiesType = new Class[propertiesValue.length];
        for (int i = 0; i < propertiesValue.length; ++i){
            propertiesType[i] = propertiesValue[i].getClass();
            if (CLASS_HASH_MAP.containsKey(propertiesType[i])){
                propertiesType[i] = CLASS_HASH_MAP.get(propertiesType[i]);
            }
        }
        return create(type, propertiesType, propertiesValue);
    }

    public Entity create(String type, Class[] propertiesType, Object[] propertiesValue) {

        Entity entity = null;
        String path;
        try {
            String capitalized = type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();
            path = supportedClasses().getProperty(capitalized);
            if (path == null){
                path = type;
            }
            entity = (Entity) Class.forName(path).getConstructor(propertiesType).newInstance(propertiesValue);
        } catch (ClassNotFoundException e) {
            print("No such class");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            print("Accessing Nonexistent Class");
            e.printStackTrace();
        } catch (InstantiationException e) {
            print("Cannot Instantiate");
            e.printStackTrace();
        } catch (NoSuchMethodException e){
            print("Type not supported");
            e.printStackTrace();
        } catch (InvocationTargetException e){
            print("Invocation Error");
            e.printStackTrace();
        }
        return entity;
    }
}

