package az.ingress.msdemo.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {

    @Pointcut("execution(* az.ingress.msdemo.services.UserService.* (..))")
    public void userServicePointCut() {

    }

    @Before("userServicePointCut()")
    public void log(JoinPoint j) {
        log.info("AOP working");
    }
}
