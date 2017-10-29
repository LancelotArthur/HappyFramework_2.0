package application;

import java.io.File;

public abstract class Application implements Printable {


    public Application() {

    }

    public void initialize() {
        print("Constructing application and initializing resources....");
        File file = new File("/lib");
        print(file.getAbsolutePath());
    }

    public void start() {
    }

    public void end() {

    }
}


