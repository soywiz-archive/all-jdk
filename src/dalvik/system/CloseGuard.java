package dalvik.system;

public class CloseGuard {
    native public void open(String close);
    native static public CloseGuard get();
    native public void close();
    native public void warnIfOpen();
}
