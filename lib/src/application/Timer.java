package application;

public class Timer implements Printable{
    private static Timer timer;
    private static long startTime;

    static {
        timer = new Timer();
        startTime = System.currentTimeMillis();
    }

    public static Timer getInstance() {
        return timer;
    }

    private Timer() {
    }

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public long getDeltaTime() {
        return System.currentTimeMillis() - startTime;
    }

    public long getCurrentTime() {
        print("Implemented with System.currentTimeMillis().");
        return System.currentTimeMillis();
    }


}
