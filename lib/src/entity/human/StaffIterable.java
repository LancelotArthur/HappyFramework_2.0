package entity.human;

import application.Printable;

public interface StaffIterable extends Printable {
    boolean hasNext();
    Staff next();
}
