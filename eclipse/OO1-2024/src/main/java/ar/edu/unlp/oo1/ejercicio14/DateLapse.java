package ar.edu.unlp.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
  private LocalDate from;
  private LocalDate to;

  public DateLapse(LocalDate from, LocalDate to) {
    this.from = from;
    this.to = to;
  }

  public int sizeInDays() {
    return (int) ChronoUnit.DAYS.between(from, to);
  }

  public boolean includesDate(LocalDate other) {
    return (other.isBefore(to) && other.isAfter(from));
  }

  public LocalDate getFrom() {
    return from;
  }

  public LocalDate getTo() {
    return to;
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public void setTo(LocalDate to) {
    this.to = to;
  }

}
