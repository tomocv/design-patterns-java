package chainofresponsibility.implementations;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Level level) {
        super(level);
    }

    @Override
    public void write(Level loggerLevel, String message) {
        if (loggerLevel == level) {
            System.out.println("Console logger [" + level + "]:" + message);
        }
    }
}
