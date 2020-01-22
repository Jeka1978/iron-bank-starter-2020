package com.nice.ironbankstarter2020;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */

public class HelloWorldService {
    @Scheduled(fixedDelay = 30000)
    public void printHello() {
        System.out.println("Hello Cruel world");
    }
}
