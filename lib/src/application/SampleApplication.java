package application;
import scene.template.SampleScene;


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
        SampleScene s1 = new SampleScene();
        s1.action();
        //addScene(s1);
        SampleScene s2 = new SampleScene();
        //addScene(s2);
        SampleScene s3 = new SampleScene();
    }


    @Override
    public void end() {
        print("Story Ends");
    }

}
