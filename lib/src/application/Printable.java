package application;


/**
 * Interface Printable
 * Implemented by all classes, used to print a message to console using a specified format
 */
public interface Printable {

    /**
     * Print function, obtains the class type name and the method name from which itself is being called
     * and prints the information alongside the description to the console.
     * Format as follows:
     * \<Class name\>    [Method Name]    Description
     *
     * @param description Message to be printed to console
     */
    default void print(String description) {
        String className = "<class: " + this.getClass().getSimpleName() + ">";
        String methodName = "[" + this.getMethodName() + "]";
        System.out.printf("%-30s %-15s : %s\n", className, methodName, description);
    }


    /**
     * See into the stacktrace and look for the fourth element in the stack, which is the function who calls the print function.
     * Zeroth element in stack: The getStackTrace function, surprising but this is the case, involving multithreading
     * First element in stack: The getMethodName function
     * Second element in stack: The print function
     * Third element in stack: the function calling the print function.
     *
     * @return The method name of the caller function,
     * if called directly from a method body, then the caller of that caller will be returned
     */
    default String getMethodName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[3];
        return e.getMethodName();
    }
}
