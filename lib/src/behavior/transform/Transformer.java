package behavior.transform;

import application.Printable;
import entity.Entity;

public class Transformer<Target extends Entity, Source> implements Transformable<Target, Source>, Printable {

    private Source source;
    private Target target;
    private Class targetClass;

    public Transformer(Source source, Class targetClass) {
        this.source = source;
        this.target = null;
        this.targetClass = targetClass;
    }

    @Override
    public Target getTarget() {
        if (this.target == null) {
            print("Transformation failed.");
            return null;
        }
        return this.target;
    }


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

    public void revert() {
        print("Reverted!");
        this.target = null;
    }

    @Override
    public Source getSource() {
        print("I was " + source.getClass().getSimpleName() + " before.");
        return this.source;
    }


}
