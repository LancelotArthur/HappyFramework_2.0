package entity.human.handler;

import application.Printable;
import entity.human.Staff;


/**
 * Handler Chain Class, each node contains a staff and a next handler
 * */
public class HandlerChain implements Printable {
    private Handler first;

    /**
     * Constructor using staff array and level array
     * */
    public HandlerChain(Staff[] staffs, int[] levels) {

        if (staffs.length != levels.length || staffs.length <= 0 || levels.length <= 0) {
            print("Not Compatible Arguments");
        } else if (staffs.length == 1) {
            first = new Handler(staffs[0], levels[0]);
        } else {
            first = new Handler(staffs[0], levels[0]);
            Handler current = first;
            for (int i = 1; i < staffs.length; ++i) {
                current.setSuccessor(new Handler(staffs[i], levels[i]));
                current = current.getSuccessor();
            }
        }
    }

    /**
     * @return Get the first handler of the chain
     * */
    public Handler getHandler() {
        return first;
    }
}
