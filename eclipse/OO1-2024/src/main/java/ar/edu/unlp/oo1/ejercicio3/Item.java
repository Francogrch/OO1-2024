package ar.edu.unlp.oo1.ejercicio3;

public class Item {
    private String detalle;
    private Integer cantidad;
    private double costoUnitario;

    public Item(String detalle, Integer cantidad, double costoUnitario) {
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public double costo(){
        return costoUnitario*cantidad;
    }
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
}
