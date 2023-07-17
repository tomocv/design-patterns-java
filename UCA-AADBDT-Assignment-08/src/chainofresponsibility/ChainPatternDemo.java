package chainofresponsibility;

import chainofresponsibility.implementations.*;

public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger abstractLogger = new ConsoleLogger(Level.Info);
        AbstractLogger fileLogger = new FileLogger(Level.Debug);
        AbstractLogger errorLogger = new ErrorLogger(Level.Error);
        AbstractLogger consoleLogger = new ConsoleLogger(Level.Debug);

        abstractLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(consoleLogger);

        abstractLogger.logMessage(Level.Info, "Info message");
        abstractLogger.logMessage(Level.Debug, "Debug message");
        abstractLogger.logMessage(Level.Error, "Error message");
    }
}
