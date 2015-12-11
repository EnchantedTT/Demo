package monitor;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by lichangjie on 09/12/2015.
 */
@Component
@Aspect
public class MonitorAspect {

    private static final Logger log = LoggerFactory.getLogger(MonitorAspect.class);

    @Pointcut(value="execution(public * *(..))")
    public void anyPublicMethod() {
    }

    @Before(value = "anyPublicMethod() && @annotation(monitor.Monitor)")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("in");
        log.info(joinPoint.getSignature().getName());
    }

//    @Around(value = "anyPublicMethod() && @annotation(monitor.Monitor)")
//    public Object monitor(ProceedingJoinPoint pjp, Monitor monitor) throws Throwable {
//        log.info("in");
//
//        // Do what you want with the actionperformed
//        //String actionPerformed = monitor.method_name();
//
//        // Do what you want with the join point arguments
//        for ( Object object : pjp.getArgs()) {
//            System.out.println(object);
//        }
//
//        return pjp.proceed();
//    }

}
