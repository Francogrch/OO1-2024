package ar.edu.unlp.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
    private LocalDate fecha;
    private Integer cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;


    public Ticket(){}
    public Ticket(Integer cantidadDeProductos, double pesoTotal, double precioTotal){
        this.cantidadDeProductos = cantidadDeProductos;
        this. pesoTotal = pesoTotal;
        this. precioTotal = precioTotal;
        fecha = LocalDate.now();
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(Integer cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }


    public double impuesto(){
        return precioTotal*0.21;
    }

}
