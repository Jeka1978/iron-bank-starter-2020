package com.nice.ironbankstarter2020;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Import(IronBankStarterConf.class)
public @interface EnableIronBankStarter {
}
