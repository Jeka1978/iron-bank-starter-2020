package com.nice.ironbankstarter2020;

/**
 * @author Evgeny Borisov
 */
public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
