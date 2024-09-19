package ar.edu.unlp.oo1.ejercicio6;

import java.time.LocalDate;

public class Mamifero {
  private String identificador, especie;
  private LocalDate fechaNacimiento;
  private Mamifero padre, madre;

  public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
    this.identificador = identificador;
    this.especie = especie;
    this.fechaNacimiento = fechaNacimiento;
    this.padre = padre;
    this.madre = madre;
  }

  public Mamifero() {
    padre = null;
    madre = null;
  }

  public Mamifero(String nombre) {
    this.identificador = nombre;
    padre = null;
    madre = null;
  }

  public Mamifero(String identificador, String especie, LocalDate fechaNacimiento) {
    this.identificador = identificador;
    this.especie = especie;
    this.fechaNacimiento = fechaNacimiento;
    padre = null;
    madre = null;
  }

  private boolean tienePadre() {
    return this.padre != null;
  }

  private boolean tieneMadre() {
    return this.madre != null;
  }

  private boolean buscarRamaPadre(Mamifero unMamifero) {
    boolean encontre = false;
    if (this.tienePadre()) {
      encontre = this.padre.equals(unMamifero);
      if (!encontre) {
        encontre = padre.tieneComoAncestroA(unMamifero);
      }
    }
    return encontre;
  }

  private boolean buscarRama(Mamifero unMamifero) {
    return this.equals(unMamifero) || (this.tienePadre() && padre.buscarRama(unMamifero))
        || (this.tieneMadre() && madre.buscarRama(unMamifero));
  }

  private boolean buscarRamaMadre(Mamifero unMamifero) {
    boolean encontre = false;
    if (this.tieneMadre()) {
      encontre = this.madre.equals(unMamifero);
      if (!encontre) {
        encontre = madre.tieneComoAncestroA(unMamifero);
      }
    }
    return encontre;
  }

  public boolean tieneComoAncestroA2(Mamifero unMamifero) {
    boolean encontre = false;
    if (unMamifero != null) {
      if (!this.equals(unMamifero)) {
        encontre = this.buscarRamaPadre(unMamifero);
        if (!encontre) {
          encontre = this.buscarRamaMadre(unMamifero);
        }
      }
    }
    return encontre;
  }

  public boolean tieneComoAncestroA(Mamifero unMamifero) {
    return (!this.equals(unMamifero)
        && ((this.tienePadre() && this.padre.buscarRama(unMamifero))
            || (this.tieneMadre() && this.madre.buscarRama(unMamifero))));
  }

  public Mamifero getAbueloMaterno() {
    return (madre != null) ? madre.getPadre() : null;
  }

  public Mamifero getAbuelaMaterna() {
    return (madre != null) ? madre.getMadre() : null;
  }

  public Mamifero getAbueloPaterno() {
    return (padre != null) ? padre.getPadre() : null;
  }

  public Mamifero getAbuelaPaterna() {
    return (padre != null) ? padre.getMadre() : null;
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Mamifero getPadre() {
    return padre;
  }

  public void setPadre(Mamifero padre) {
    this.padre = padre;
  }

  public Mamifero getMadre() {
    return madre;
  }

  public void setMadre(Mamifero madre) {
    this.madre = madre;
  }
}
