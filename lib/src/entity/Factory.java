package entity;

import application.Printable;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Properties;


/**
 * Singleton
 * Factory Method for instantiating non-prototype entities
 */
public class Factory implements Printable {

    private static Factory instance = new Factory();
    public static Factory getInstance(){
        return instance;
    }
    private Factory(){

    }

    private final static HashMap<Class, Class> CLASS_HASH_MAP = new HashMap<>();

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

    /**
     * Create an entity of the specified type
     *
     * @param type typename to be instantiated, either class name or the class name alongside with the package
     * @return Entity with type specified
     */
    public Entity create(String type) {

        return create(type, new Object[]{});
    }

    /**
     * Create an entity of the specified type, with propertiesValue used to initialize the entity
     *
     * @param type            typename to be instantiated, either class name or the class name alongside with the package
     * @param propertiesValue propertiesValue is used to construct an entity, the types of the elements in the array must
     *                        correspond to one of the constructors defined
     * @return Entity with type specified, and initiated with propertiesValue
     */
    public Entity create(String type, Object[] propertiesValue) {
        Class[] propertiesType = new Class[propertiesValue.length];
        for (int i = 0; i < propertiesValue.length; ++i) {
            propertiesType[i] = propertiesValue[i].getClass();
            if (CLASS_HASH_MAP.containsKey(propertiesType[i])) {
                propertiesType[i] = CLASS_HASH_MAP.get(propertiesType[i]);
            }
        }
        return create(type, propertiesType, propertiesValue);
    }


    /**
     * Create an entity of the specified type, with propertiesValue used to initialize the entity
     *
     * @param type            typename to be instantiated, either class name or the class name alongside with the package
     * @param propertiesValue propertiesValue is used to construct an entity, the types of the elements in the array must
     *                        correspond to one of the constructors defined
     * @param propertiesType  specify the classes of elements in propertiesValue explicitly
     * @return Entity with type specified, and initiated with propertiesValue
     */
    public Entity create(String type, Class[] propertiesType, Object[] propertiesValue) {

        Entity entity = null;
        String path;
        try {
            String capitalized = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
            path = supportedClasses().getProperty(capitalized);
            if (path == null) {
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
        } catch (NoSuchMethodException e) {
            print("Type not supported");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            print("Invocation Error");
            e.printStackTrace();
        }
        return entity;
    }

    private static Properties supportedClasses() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("lib/properties/factory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}

