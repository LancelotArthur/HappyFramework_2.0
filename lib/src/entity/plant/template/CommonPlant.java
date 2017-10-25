package entity.plant.template;

import application.Printable;
import entity.animal.Animal;
import entity.animal.AnimalType;
import entity.plant.Plant;
import entity.plant.PlantType;

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

	public Plant purchaseAgain(PlantType plantType) {
		for (Plant plant : commonPlantlList) {
			if (plant.getPlantType().equals(plantType)) {
				print("Buying a " + plant.getPlantType().name() + " again from your common list.");
				return plant.purchaseAgain();
			}
		}
		print("No such plant type in the list of commonly purchased plants.");
		return null;
	}
}
