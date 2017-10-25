package entity.animal.template;

import application.Printable;
import allocator.Allocator;
import allocator.Strategy;
import entity.animal.Animal;
import entity.animal.AnimalType;

import java.util.ArrayList;

public final class CommonAnimal implements Printable {

	private static volatile CommonAnimal commonAnimalsInstance;
	private ArrayList<Animal> commonAnimalList = new ArrayList<>();

	private CommonAnimal() {}

	public static CommonAnimal getCommonAnimalsInstance() {
		if (commonAnimalsInstance == null) {
			synchronized (CommonAnimal.class) {
				if (commonAnimalsInstance == null) {
					commonAnimalsInstance = new CommonAnimal();
				}
			}
		}
		return commonAnimalsInstance;
	}

	public void addCommonAnimalTypeFrom(Animal animal) {
		commonAnimalList.add(animal);
	}

	public Animal purchaseAgain(AnimalType animalType) {
		for (Animal animal : commonAnimalList) {
			if (animal.getAnimalType().equals(animalType)) {
				print("Buying a " + animal.getAnimalType().name() + " again from your common list.");
				return animal.purchaseAgain();
			}
		}
		print("No such animal type in the list of commonly purchased animals.");
		return null;
	}
}
