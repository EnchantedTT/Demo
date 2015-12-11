package monitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by lichangjie on 08/12/2015.
 */
public class LogEntity {
    private static final Logger log = LoggerFactory.getLogger(LogEntity.class);

    @Monitor
    public static void test(){
        log.info("execute");
    }
}
