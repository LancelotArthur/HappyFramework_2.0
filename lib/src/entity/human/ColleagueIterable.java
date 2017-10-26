package entity.human;

import application.Printable;
import entity.human.templete.Staff;

public interface ColleagueIterable extends Printable {
    boolean hasNextColleague();
    Staff nextColleague();
}
