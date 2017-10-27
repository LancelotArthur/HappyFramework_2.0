package application;


public interface Printable {

    default void print(String description) {
        String className = "<class: " + this.getClass().getSimpleName() + ">";
        String methodName = "[" + this.getMethodName() + "]";
        System.out.printf("%-30s %-15s : %s\n", className, methodName, description);
    }

    default String getMethodName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[3];
        return e.getMethodName();
    }
}
