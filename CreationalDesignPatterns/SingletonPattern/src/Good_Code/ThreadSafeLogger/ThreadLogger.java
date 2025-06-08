package Good_Code.ThreadSafeLogger;

public class ThreadLogger {
    private static volatile ThreadLogger instance;
    private ThreadLogger() {}

    public static ThreadLogger getInstance() {
        if (instance == null) {
            synchronized (ThreadLogger.class) {
                if (instance == null) {
                    instance = new ThreadLogger();
                }
            }
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
