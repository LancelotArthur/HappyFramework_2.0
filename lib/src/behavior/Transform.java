package behavior;

import application.Printable;
import entity.Entity;


public class Transform<Target extends Entity, Source> implements Transformable<Target, Source>, Printable {

    private Source source;
    private Target target;
    private Class targetClass;

    public Transform(Source source, Class targetClass) {
        this.source = source;
        this.target = null;
        this.targetClass = targetClass;
    }

    @Override
    public Target getTarget() {
        if (this.target == null) {
            print("Transform failed. Nothing will be returned.");
            return null;
        }
        return this.target;
    }


    @Override
    @SuppressWarnings(value = {"unchecked"})
    public void transform() throws IllegalAccessException, InstantiationException {
        print("Transforming " + source.getClass().getSimpleName()
                + " into " + source.getClass().getSimpleName() + "...");
        this.target = (Target) targetClass.newInstance();
    }

    @Override
    public Source getSource() {
        print("I was " + source.getClass().getSimpleName() + " before.");
        return this.source;
    }

}