package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelArithmetic")
public class SpelArithmetic {
    @Value("#{19 + 1}")
    private double add;

    @Value("#{'Some string ' + 'plus other string'}")
    private String addString;

    @Value("#{20 - 1}")
    private double subtract;

    @Value("#{10 * 2}")
    private double multiply;

    @Value("#{36 / 2}")
    private double divide;
    
    @Value("#{36 div 2}")
    private double divideAlphabetic;

    @Value("#{37 % 10}")
    private double modulo;
    @Value("#{37 mod 10}")
    private double moduloAlphabetic;

    @Value("#{2 ^ 9}")
    private double powerOf;

    @Value("#{(2 + 2) * 2 + 9}")
    private double brackets;

    @Override
    public String toString() {
        return "SpelArithmetic{" +
                "add=" + add +
                ", addString='" + addString + '\'' +
                ", subtract=" + subtract +
                ", multiply=" + multiply +
                ", divide=" + divide +
                ", divideAlphabetic=" + divideAlphabetic +
                ", modulo=" + modulo +
                ", moduloAlphabetic=" + moduloAlphabetic +
                ", powerOf=" + powerOf +
                ", brackets=" + brackets +
                '}';
    }
}