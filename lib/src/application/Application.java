package application;

import java.io.File;


/**
 * Abstract Application class represents the whole process through which, data accesses and manipulations can be applied.
 * One application should be instantiated for one program.
 * The application first be initialized, calling initialize(). and start processing by calling start() function.
 */
public abstract class Application implements Printable {


    /**
     * Default Constructor
     */
    public Application() {

    }

    /**
     * Program Initializer, should be called each time the program first executes/
     */
    public void initialize() {
        print("Constructing application and initializing resources....");
        File file = new File("/lib");
        print(file.getAbsolutePath());
    }

    /**
     * Program Entrance
     */
    public void start() {
    }

    /**
     * Program Finalizer, should be called each time the program finished execution.
     */
    public void end() {

    }
}


