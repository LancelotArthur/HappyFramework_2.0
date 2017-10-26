package application;

import application.strategy.Orderable;
import application.strategy.SequentialOrder;
import scene.Scene;

import java.util.ArrayList;
import java.util.List;

public abstract class Application implements Printable {

    public Application() {
        print("Constructing application and initializing resources....");
    }

    public void initialize() {

    }

    public abstract void start();

    public abstract void end();
}


