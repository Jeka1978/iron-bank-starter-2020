package com.nice.ironbankstarter2020;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */

@Aspect
public class IronBankExceptionHandlerAspect {

    @Autowired
    private RavenProps ravenProps;


    @Pointcut("execution(* com.nice..*.*(..))")
    public void allNiceMethods() {
    }

    private Map<NotEnoughMoneyException,Void> exceptions = new WeakHashMap<>();


    @AfterThrowing(pointcut = "allNiceMethods()", throwing = "ex")
    public void handleNotEnoughMoneyException(NotEnoughMoneyException ex) {
        if (!exceptions.containsKey(ex)) {
            System.out.println("raven was sent to "+ ravenProps.getDestination()+" " + ex.getMessage());
            exceptions.put(ex,null);
        }
    }


}
