package application;

import java.io.*;

public abstract class Application implements Printable {

    private final String DEFAULT_OUTPUT_FILE = "Log.txt";
    private Method printDestination = Method.TERMINAL;
    private OutputStream outputStream = null;

    public Application() {
        print("Constructing application and initializing resources....");
    }

    public void initialize() throws FileNotFoundException {
        File file = new File(DEFAULT_OUTPUT_FILE);
        outputStream = new FileOutputStream(file);
    }

    public void start() {

    }

    public void end() throws IOException {
        outputStream.close();
    }

    public void printToTerminal() throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        printDestination = Method.TERMINAL;
    }

    public void logToFile() throws IOException {
        logToFile(DEFAULT_OUTPUT_FILE);
    }

    public void logToFile(String filename) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        File file = new File(filename);
        outputStream = new FileOutputStream(file);
    }

    enum Method {
        TERMINAL, LOG
    }
}


