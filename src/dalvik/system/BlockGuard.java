package dalvik.system;

public class BlockGuard {
    public interface Policy {
        /**
         * Called on disk writes.
         */
        void onWriteToDisk();
        /**
         * Called on disk writes.
         */
        void onReadFromDisk();
        /**
         * Called on network operations.
         */
        void onNetwork();
        /**
         * Returns the policy bitmask, for shipping over Binder calls
         * to remote threads/processes and reinstantiating the policy
         * there.  The bits in the mask are from the DISALLOW_* and
         * PENALTY_* constants.
         */
        int getPolicyMask();
    }

    native public static Policy getThreadPolicy();
}
