
import application.Application;
import application.Director;
import scene.template.SampleScene;


public class SampleApplication extends Application {

    public SampleApplication() {
        super();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void start() {
        print("Story Starts");
        SampleScene scene = new SampleScene();
        Director.getInstance().setScene(scene).runWithScene();
    }


    @Override
    public void end() {
        print("Story Ends");
    }

}
