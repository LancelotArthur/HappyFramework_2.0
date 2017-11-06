package application;


/**
 * Singleton
 * Timer class allows timing techniques
 */
public class Timer implements Printable {
    private static Timer timer;
    private static long startTime;

    static {
        timer = new Timer();
        startTime = System.currentTimeMillis();
    }

    private Timer() {
    }

    /**
     * Get Instance
     */
    public static Timer getInstance() {
        return timer;
    }


    /**
     * Reset the start time
     */
    public void resetTime() {
        startTime = System.currentTimeMillis();
    }

    /**
     * Get the elapsed time counting from the start time.
     */
    public long getDeltaTime() {
        return System.currentTimeMillis() - startTime;
    }

    /**
     * Get the current system time.
     */
    public long getCurrentTime() {
        print("Implemented with System.currentTimeMillis().");
        return System.currentTimeMillis();
    }
}
