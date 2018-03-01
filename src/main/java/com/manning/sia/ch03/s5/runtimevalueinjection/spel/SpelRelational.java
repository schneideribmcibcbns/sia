package com.manning.sia.ch03.s5.runtimevalueinjection.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelRelational")
public class SpelRelational {
    @Value("#{1 == 1}")
    private boolean equal;

    @Value("#{1 eq 1}")
    private boolean equalAlphabetic;

    @Value("#{1 != 1}")
    private boolean notEqual;

    @Value("#{1 ne 1}")
    private boolean notEqualAlphabetic;

    @Value("#{1 < 1}")
    private boolean lessThan;

    @Value("#{1 lt 1}")
    private boolean lessThanAlphabetic;

    @Value("#{1 <= 1}")
    private boolean lessThanOrEqual;

    @Value("#{1 le 1}")
    private boolean lessThanOrEqualAlphabetic;

    @Value("#{1 > 1}")
    private boolean greaterThan;

    @Value("#{1 gt 1}")
    private boolean greaterThanAlphabetic;

    @Value("#{9 >= 6}")
    private boolean greaterThanOrEqual;

    @Value("#{9 ge 6}")
    private boolean greaterThanOrEqualAlphabetic;

    @Value("#{250 > 200 && 200 < 4000}")
    private boolean and;

    @Value("#{250 > 200 and 200 < 4000}")
    private boolean andAlphabetic;

    @Value("#{400 > 300 || 150 < 100}")
    private boolean or;

    @Value("#{400 > 300 or 150 < 100}")
    private boolean orAlphabetic;

    @Value("#{!true}")
    private boolean not;

    @Value("#{not true}")
    private boolean notAlphabetic;

    @Override
    public String toString() {
        return "SpelRelational{" +
                "equal=" + equal +
                ", equalAlphabetic=" + equalAlphabetic +
                ", notEqual=" + notEqual +
                ", notEqualAlphabetic=" + notEqualAlphabetic +
                ", lessThan=" + lessThan +
                ", lessThanAlphabetic=" + lessThanAlphabetic +
                ", lessThanOrEqual=" + lessThanOrEqual +
                ", lessThanOrEqualAlphabetic=" + lessThanOrEqualAlphabetic +
                ", greaterThan=" + greaterThan +
                ", greaterThanAlphabetic=" + greaterThanAlphabetic +
                ", greaterThanOrEqual=" + greaterThanOrEqual +
                ", greaterThanOrEqualAlphabetic=" + greaterThanOrEqualAlphabetic +
                ", and=" + and +
                ", andAlphabetic=" + andAlphabetic +
                ", or=" + or +
                ", orAlphabetic=" + orAlphabetic +
                ", not=" + not +
                ", notAlphabetic=" + notAlphabetic +
                '}';
    }
}