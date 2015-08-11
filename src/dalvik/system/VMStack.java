package dalvik.system;

public class VMStack {
    native public static Class<?>[] getClasses(int i);
    native public static ClassLoader getCallingClassLoader();
    native public static StackTraceElement[] getThreadStackTrace(Thread thread);
    native public static Class<?> getStackClass2();
}
