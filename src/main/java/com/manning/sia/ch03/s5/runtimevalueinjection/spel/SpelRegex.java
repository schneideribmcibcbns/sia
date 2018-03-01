package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelRegex")
public class SpelRegex {

    @Value("#{100 matches '\\d+' }")
    private boolean validNumericStringResult;

    @Value("#{'100fghdjf' matches '\\d+' }")
    private boolean invalidNumericStringResult;

    @Value("#{'valid alphabetic string' matches '[a-zA-Z\\s]+' }")
    private boolean validAlphabeticStringResult;

    @Value("#{'invalid alphabetic string #$1' matches '[a-zA-Z\\s]+' }")
    private boolean invalidAlphabeticStringResult;

    @Value("#{engine.horsePower matches '\\d+'}")
    private boolean validFormatOfHorsePower;

    @Override
    public String toString() {
        return "SpelRegex{" +
                "validNumericStringResult=" + validNumericStringResult +
                ", invalidNumericStringResult=" + invalidNumericStringResult +
                ", validAlphabeticStringResult=" + validAlphabeticStringResult +
                ", invalidAlphabeticStringResult=" + invalidAlphabeticStringResult +
                ", validFormatOfHorsePower=" + validFormatOfHorsePower +
                '}';
    }
}