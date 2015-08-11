package dalvik.system;

import java.io.FileDescriptor;
import java.net.Socket;
import java.net.SocketException;

public class SocketTagger {
    native public static synchronized SocketTagger get();

    native public void tag(FileDescriptor socketDescriptor) throws SocketException;
    native public void untag(FileDescriptor socketDescriptor) throws SocketException;

    native public final void tag(Socket socket) throws SocketException;
    native public final void untag(Socket socket) throws SocketException;
}
