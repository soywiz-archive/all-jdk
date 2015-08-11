package dalvik.system;

public class VMRuntime {
    native public static VMRuntime getRuntime();
    native public Object newNonMovableArray(Class<Byte> byteClass, int byteCount);
    native public long addressOf(byte[] array);
    native public boolean isDebuggerActive();
    native public String bootClassPath();
    native public String classPath();
    native public String vmVersion();
    native public String[] properties();
}
