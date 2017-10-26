import application.SampleApplication;

public class Main {
    public static void main(String[] args) {
        SampleApplication application = new SampleApplication();
        application.initialize();
        application.start();
        application.end();
    }
}
