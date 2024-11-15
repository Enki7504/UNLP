package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateLapse{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}

	public int sizeInDays() {
		return (int)ChronoUnit.DAYS.between(from, to);
	}

	public boolean includesDate(LocalDate other) {
		return (other.isAfter(from) || other.isEqual(from)) &&
				(other.isBefore(to) || other.isEqual(to));
	}
	
	/**
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/

	public boolean overlaps (DateLapse anotherDateLapse) {
		return (this.includesDate(anotherDateLapse.getFrom()) || this.includesDate(anotherDateLapse.getTo()));
	}

	public boolean equals(DateLapse o) {
		return (this.from.isEqual(o.getFrom()) && this.to.isEqual(o.getTo()));
	}
}
