package behavior.creature.animal;

import behavior.creature.Yielding;

/**
 * Encapsulates the common animal behaviors
 *
 * @see entity.creature.animal.Animal
 * @see Movable
 * @see Yielding
 * @see Speakable
 */
public interface AnimalBehavior extends Movable, Speakable, Yielding {

}
