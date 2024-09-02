package ar.edu.unlp.oo1.ejercicio3bis;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private List<Producto>  productos;
    private double pesoTotal;
    private double precioTotal;


    public Ticket(){}
    public Ticket(List<Producto> productos, double pesoTotal, double precioTotal){
        this.productos= productos;
        this. pesoTotal = pesoTotal;
        this. precioTotal = precioTotal;
        fecha = LocalDate.now();
    }
    // Nuevo
    public Ticket(List<Producto> productos){
        this.productos= productos;
        this. pesoTotal = productos.stream().mapToDouble(p -> p.getPeso()).sum();
        this. precioTotal = productos.stream().mapToDouble(p->p.getPrecio()).sum();
        fecha = LocalDate.now();
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
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
