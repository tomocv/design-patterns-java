package chainofresponsibility.implementations;

import static java.util.Objects.nonNull;

public abstract class AbstractLogger {

    protected Level level;

    protected AbstractLogger nextLogger;

    public AbstractLogger(Level level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(Level level, String message) {

        write(level, message);

        if (nonNull(nextLogger)) {
            nextLogger.logMessage(level, message);
        }

    }

    public abstract void write(Level loggerLevel, String message);
}
