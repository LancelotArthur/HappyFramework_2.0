package application;

public class Timer implements Printable {
    private static Timer timer;
    private static long startTime;

    static {
        timer = new Timer();
        startTime = System.currentTimeMillis();
    }

    private Timer() {
    }

    public static Timer getInstance() {
        return timer;
    }

    public void resetTime() {
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
