package ar.edu.unlp.oo1.ejercicio14b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
  private LocalDate from;
  private int sizeInDays;

  public DateLapse(LocalDate from, int sizeInDays) {
    this.from = from;
    this.sizeInDays = sizeInDays;
  }

  public DateLapse(LocalDate from, LocalDate to) {
    this.from = from;
    this.sizeInDays = (int) ChronoUnit.DAYS.between(from, to);
  }

  public int sizeInDays() {
    return sizeInDays();
  }

  public boolean includesDate(LocalDate other) {
    return (other.isBefore(getTo()) && other.isAfter(from));
  }

  public LocalDate getFrom() {
    return from;
  }

  public LocalDate getTo() {
    return from.plusDays(sizeInDays);
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public void setSizeInDays(int sizeInDays) {
    this.sizeInDays = sizeInDays;
  }

}
