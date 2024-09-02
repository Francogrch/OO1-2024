package ar.edu.unlp.oo1.ejercicio5;

import java.time.LocalDate;

public class Mamifero {
    private String identificador,especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre,madre;


    public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.padre = padre;
        this.madre = madre;
    }

    public Mamifero(String identificador, String especie, LocalDate fechaNacimiento) {
        this.identificador = identificador;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        padre = null;
        madre = null;
    }

    public boolean tieneComoAncestro(Mamifero unMamifero){
        boolean encontre = false;
            if (unMamifero != null){
                if (padre != null) {
                    if (padre.getIdentificador().equals(unMamifero.getIdentificador())){
                        encontre = true;
                    }else{
                        encontre = padre.tieneComoAncestro(unMamifero);
                    }
                }
                if (!encontre){
                if (madre != null){
                    if (madre.getIdentificador().equals(unMamifero.getIdentificador())){
                        encontre = true;
                    }else{
                        encontre = madre.tieneComoAncestro(unMamifero);
                    }
                }}
            }
        return encontre;
    }
    public Mamifero getAbueloMaterno(){
        return (madre != null) ? madre.getPadre() : null;
    }
    public Mamifero getAbuelaMaterna(){
        return (madre != null) ? madre.getMadre() : null;
    }
    public Mamifero getAbueloPaterno(){
        return (padre != null) ? padre.getPadre() : null;
    }
    public Mamifero getAbuelaPaterna(){
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
