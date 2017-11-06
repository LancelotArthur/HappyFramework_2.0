package behavior.transform;

import application.Printable;
import entity.Entity;

/**
 * The Generic transformer class Implements the transformable interface
 * Provides a generic adapter.
 * */
public class Transformer<Target extends Entity, Source> implements Transformable<Target, Source>, Printable {

    private Source source;
    private Target target;
    private Class targetClass;

    /**
     * Constructor, with a source object and the class type to be adapted into
     *
     * @param source the source entity to be adapted
     * @param targetClass the class type to be adapted into, should be same as Target.class
     * */
    public Transformer(Source source, Class targetClass) {
        this.source = source;
        this.target = null;
        this.targetClass = targetClass;
    }

    /**
     * Get the Target entity
     *
     * @return the target entity
     * */
    @Override
    public Target getTarget() {
        if (this.target == null) {
            print("Transformation failed.");
            return null;
        }
        return this.target;
    }


    /**
     * Activate the transformation
     *
     * @return self
     * */
    @Override
    @SuppressWarnings(value = {"unchecked"})
    public Transformer<Target, Source> transform() {
        print("Transforming " + source.getClass().getSimpleName()
                + " into " + targetClass.getSimpleName() + "...");

        try {
            this.target = (Target) targetClass.newInstance();
        } catch (InstantiationException e) {
            print("Instantiation Error");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            print("Access Denied");
            e.printStackTrace();
        }

        return this;
    }


    /**
     * Get the source entity
     *
     * @return the target entity
     * */
    @Override
    public Source getSource() {
        print("I was " + source.getClass().getSimpleName() + " before.");
        return this.source;
    }


    /**
     * Clear the target entity, revert the adaptation
     * */
    public void revert() {
        print("Reverted!");
        this.target = null;
    }


}
