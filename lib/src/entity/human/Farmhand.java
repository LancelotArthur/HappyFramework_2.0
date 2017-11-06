package entity.human;

/**
 * Farmhand Class
 *
 * @see Leader
 * @see Farmhand
 * */
public class Farmhand extends Staff {

    public Farmhand(String name, boolean gender) {
        super(name, gender);
    }

    public Farmhand(String name, boolean gender, double age) {
        super(name, gender, age);
    }
}
