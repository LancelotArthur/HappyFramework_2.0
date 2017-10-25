package entity.animal;

import entity.Prototype;


public final class AnimalPrototype extends Prototype {

    private static volatile AnimalPrototype instance;
    public static AnimalPrototype getInstance() {
        if (instance == null) {
            synchronized (Prototype.class) {
                if (instance == null) {
                    instance = new AnimalPrototype();
                }
            }
        }
        return instance;
    }

    private AnimalPrototype(){
        super();
        for (AnimalType type: AnimalType.values()){
            String name;
            String[] packages = type.toString().split("_");

            if (packages.length == 1){
                name = "entity.animal.template." + type.toString();
            }else {
                name = String.join(".",packages);
            }

            Animal animal = (Animal) initPrototype(name);
            if (animal != null){
                addPrototype(packages[packages.length - 1], animal);
            }
        }
    }
}
