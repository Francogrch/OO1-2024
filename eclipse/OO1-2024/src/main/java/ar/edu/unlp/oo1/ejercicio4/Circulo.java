package ar.edu.unlp.oo1.ejercicio4;

public class Circulo extends Cuerpo2D{

    private double radio;
    private double diamentro;


    public Circulo(double radio) {
        diamentro = radio  * 2;
        this.radio = radio;
    }
    public double getPerimetro(){
        return Math.round(diamentro*Math.PI);
    }
    public double getArea(){
        return Math.round(Math.PI * Math.pow(radio,2));
    }

    public double getDiamentro() {
        return diamentro;
    }

    public void setDiamentro(double diamentro) {
        this.diamentro = diamentro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
