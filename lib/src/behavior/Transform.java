package behavior;

import allocator.Allocator;
import allocator.ObtainStrategy;
import application.Printable;
import entity.Entity;


public class Transform<Target extends Entity, Source> implements Transformable<Target, Source>, Printable {

    private Source source;
    private Target target;

    public Transform(Source source) {
        this.source = source;
        this.target = null;
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
    public void transform() {
        print("Transforming " + source.getClass().getSimpleName()
                + " into " + source.getClass().getSimpleName() + "...");
        // For completeness of this framework
        Allocator<Target> allocator = new Allocator<>();
        allocator.setObtainArguments(ObtainStrategy.PURCHASE);
        this.target = allocator.obtain();
    }

    @Override
    public Source getSource() {
        print("I was " + source.getClass().getSimpleName() + " before.");
        return this.source;
    }

}