package entity.human.handler;

import application.Printable;
import entity.human.Staff;

public class HandlerChain implements Printable {
    private Handler first;

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

    public Handler getHandler() {
        return first;
    }
}
