package chainofresponsibility.implementations;

public class FileLogger extends AbstractLogger {

    public FileLogger(Level level) {
        super(level);
    }

    @Override
    public void write(Level loggerLevel, String message) {
        if (loggerLevel == level) {
            System.out.println("File logger [" + level + "]:" + message);
        }
    }
}
