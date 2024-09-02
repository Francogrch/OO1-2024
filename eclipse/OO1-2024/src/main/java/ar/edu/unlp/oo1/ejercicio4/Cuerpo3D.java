package ar.edu.unlp.oo1.ejercicio4;

public class Cuerpo3D {
    private Cuerpo2D caraBasal;
    private double altura;

    public Cuerpo3D(Cuerpo2D caraBasal, double altura) {
        this.caraBasal = caraBasal;
        this.altura = altura;
    }
    public double getSuperficieExterior(){
        return Math.round(2* caraBasal.getArea() + (caraBasal.getPerimetro() * altura));
    }
    public double getVolumen(){
        return Math.round(caraBasal.getArea() * altura);
    }

    public Cuerpo2D getCaraBasal() {
        return caraBasal;
    }

    public void setCaraBasal(Cuerpo2D caraBasal) {
        this.caraBasal = caraBasal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
