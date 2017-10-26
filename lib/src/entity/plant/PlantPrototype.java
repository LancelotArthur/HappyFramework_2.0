package entity.plant;

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
		for (PlantType type: PlantType.values()){
			String name;
			String[] packages = type.toString().split("_");

			if (packages.length == 1){
				name = "entity.plant.template." + type.toString();
			}else {
				name = String.join(".",packages);
			}

			Plant plant = (Plant) initPrototype(name);
			if (plant != null){
				addPrototype(packages[packages.length - 1], plant);
			}
		}
	}

}

