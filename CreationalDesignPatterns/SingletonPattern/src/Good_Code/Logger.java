package Good_Code;

public class Logger {
    private static Logger logger = null;
    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String messsage) {
        System.out.println("Log: " + messsage);
    }
}
