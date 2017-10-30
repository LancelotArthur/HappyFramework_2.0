package behavior.creature.plant;

import behavior.creature.Yielding;


/**
 * The PlantBehavior interface encapsulates the common plant behaviors
 *
 * @see entity.creature.plant.Plant
 * @see Growable
 * @see Yielding
 */
public interface PlantBehavior extends Growable, Yielding, Cloneable {
}
