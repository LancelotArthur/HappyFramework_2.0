package entity.creature.plant;

import entity.Prototype;

public final class PlantPrototype extends Prototype {

	private static volatile PlantPrototype instance;

	public static PlantPrototype getInstance() {
		if (instance == null) {
			synchronized (Prototype.class) {
				if (instance == null) {
					instance = new PlantPrototype();
				}
			}
		}
		return instance;
	}

	private PlantPrototype(){
		super();
        //TODO COPY FROM ANIMAL PROTOTYPE
    }

}

