package designpattern_and_principles;

public class SingletonTest {
	public static void main(String[] args) {
        // Get the Logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify that both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both the loggers refer to the same instance.");
        } else {
            System.out.println("Error: logger1 & logger2 are different instances.");
        }

        // Use the logger
        logger1.log("A log message from logger1.");
        logger2.log("A log message from logger2.");
    }

}
