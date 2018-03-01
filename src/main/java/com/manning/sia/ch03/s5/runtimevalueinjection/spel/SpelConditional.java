package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelConditional")
public class SpelConditional {
    @Value("#{false ? 'There was true value' : 'Something went wrong. There was false value'}")
    private String ternary;

    @Value("#{someCar.model != null ? someCar.model : 'Unknown model'}")
    private String ternary2;

    @Value("#{someCar.model?:'Unknown model'}")
    private String elvis;

    @Override
    public String toString() {
        return "SpelConditional{" +
                "ternary='" + ternary + '\'' +
                ", ternary2='" + ternary2 + '\'' +
                ", elvis='" + elvis + '\'' +
                '}';
    }
}