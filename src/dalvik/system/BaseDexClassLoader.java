package dalvik.system;

public class BaseDexClassLoader extends ClassLoader {
    native public String getLdLibraryPath();
}
