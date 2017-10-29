package entity.human.handler;


import application.Printable;
import entity.human.Staff;
import entity.human.event.Event;


public class Handler implements Printable {

    private int level = 0;
    private Handler successor;
    private Staff staff;


    public Handler(Staff staff, int level) {
        this.staff = staff;
        this.level = level;
    }


    public int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    public Handler getSuccessor() {
        return successor;
    }

    void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Staff getStaff() {
        return staff;
    }

    public void handleRequest(Event event) {
        if (this.level >= event.getLevel())
        {
            event.settle();
            print("The request is settled by " + staff.getName());
        }
        else
        {
            if (successor != null)
            {
                print(staff.getName() + " is not able to settle a request like this. Try to access another person");
                successor.handleRequest(event);
            }else
            {
                event.happen();
                print("This event is catastrophic. No one dealt with it. Just let it be.");
            }
        }

    }
}
