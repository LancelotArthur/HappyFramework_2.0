package entity.building.template;

import entity.building.abstraction.Foundation;
import entity.building.abstraction.Material;

public class FoundationA extends Foundation {
    public FoundationA() {
        super(Material.METAL, 100);
    }
}
