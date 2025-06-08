package Good_Code;

import Good_Code.ThreadSafeLogger.ThreadLogger;

public class Application {
    public void run() {
        Logger logger = Logger.getLogger();
        logger.log("Application has started");
        ThreadLogger threadLogger = ThreadLogger.getInstance();
        threadLogger.log("Application is thread safe");
    }
}
