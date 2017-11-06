package entity.building.factory;

import application.Printable;
import entity.building.abstraction.PartType;

/**
 * Singleton
 * The abstract factory, for producing part of the locations
 * */
public class AbstractFactory implements Printable {

    private static AbstractFactory instance = new AbstractFactory();
    private AbstractFactory(){
    }
    /**
     * Get instance
     * */
    public static AbstractFactory getInstance() {
        return instance;
    }

    /**
     * Get the corresponding factory specified by partType
     * */
    public PartFactory getFactory(PartType partType){
        switch (partType){
            case DOOR:
                return DoorFactory.getInstance();
            case ROOF:
                return RoofFactory.getInstance();
            case FOUNDATION:
                return FoundationFactory.getInstance();
            case WALL:
                return WallFactory.getInstance();
            default:
                return null;
        }
    }

}
