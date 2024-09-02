package ar.edu.unlp.oo1.ejercicio4;

public class Cuadrado extends Cuerpo2D{
    private double lado;
    public Cuadrado(double lado){
        this.lado=lado;
    }

    public double getArea(){
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return lado*4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
