package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {

    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom(){
        return this.from;
    }

    public LocalDate getTo(){
        return this.to;
    }

    public int sizeInDays(){
        return (int) ChronoUnit.DAYS.between(this.from, this.to);
    }

    public boolean includesDate(LocalDate other){
        return (other.isEqual(this.from) || other.isEqual(this.to) || (other.isAfter(this.from) && other.isBefore(this.to)));
    }

}
