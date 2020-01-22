package com.nice.ironbankstarter2020;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@EnableConfigurationProperties(RavenProps.class)
public class IronBankStarterConf {
    @Bean
    public HelloWorldService helloWorldService(){
        return new HelloWorldService();
    }


    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    public IronBankExceptionHandlerAspect ironBankExceptionHandlerAspect(){
        return new IronBankExceptionHandlerAspect();
    }
}







