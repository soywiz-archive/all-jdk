package dalvik.system;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public abstract class DalvikLogHandler extends Handler {
    @Override
    public void close() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void publish(LogRecord record) {

    }

    abstract public void publish(Logger logger, String androidTag, Level logLevel, String msg);
}
