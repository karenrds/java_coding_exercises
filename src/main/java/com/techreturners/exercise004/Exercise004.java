package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    public LocalDateTime momentDateTime;
    final int gigaSecond = 1000000000;
    
    public Exercise004(LocalDate date) {
        momentDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        momentDateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return momentDateTime.plusSeconds(gigaSecond);
    }
}
