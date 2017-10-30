package entity.human.event;


/**
 * Concrete Event Class Emergency
 * */
public class Emergency extends Event {
    public Emergency(int level) {
        super(level);
    }

    @Override
    public void happen() {
        if (isSettled()) {
            return;
        }
        print("EMERGENCY!!!");
    }
}
