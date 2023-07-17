package chainofresponsibility.implementations;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(Level level) {
        super(level);
    }

    @Override
    public void write(Level loggerLevel, String message) {
        if (loggerLevel == level) {
            System.out.println("Error logger [" + level + "]:" + message);
        }
    }
}
