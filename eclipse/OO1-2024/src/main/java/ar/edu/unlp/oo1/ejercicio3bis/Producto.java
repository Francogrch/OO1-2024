package ar.edu.unlp.oo1.ejercicio3bis;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto(){}

    public Producto(double peso, double precioPorKilo, String descripcion) {
        this.peso = peso;
        this.precioPorKilo = precioPorKilo;
        this.descripcion = descripcion;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public  double getPrecio(){
        return peso*precioPorKilo;
    }
}
