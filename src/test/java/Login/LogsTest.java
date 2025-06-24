package Login;

import com.zoodel.generic_android.GlobalVariable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogsTest extends GlobalVariable {
    Logger log = LogManager.getLogger(LogsTest.class);
    @Test
    void printLogs(){
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("info log");
        log.fatal("fatal log");
        log.error("error log");
    }
}
