package entity.creature.plant.template;

import application.Printable;
import entity.creature.plant.Plant;

import java.util.ArrayList;

public final class CommonPlant implements Printable {

	private static volatile CommonPlant commonPlantInstance;
	private ArrayList<Plant> commonPlantlList = new ArrayList<>();

	private CommonPlant() {}

	public static CommonPlant getCommonPlantInstance() {
		if (commonPlantInstance == null) {
			synchronized (CommonPlant.class) {
				if (commonPlantInstance == null) {
					commonPlantInstance = new CommonPlant();
				}
			}
		}
		return commonPlantInstance;
	}

	public void addCommonAnimalTypeFrom(Plant plant) {
		commonPlantlList.add(plant);
	}


}
