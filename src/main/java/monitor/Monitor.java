package monitor;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by lichangjie on 08/12/2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Monitor {

}