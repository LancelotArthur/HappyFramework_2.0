import application.Application;


public class SampleApplication extends Application {

    public SampleApplication() {
        super();
    }

    @Override
    public void start() {
        print("Story Starts");
    }

    @Override
    public void initialize() {

    }


    @Override
    public void end() {
        print("Story Ends");
    }

}
