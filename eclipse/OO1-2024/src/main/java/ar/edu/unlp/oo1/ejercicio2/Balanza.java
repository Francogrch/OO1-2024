package ar.edu.unlp.oo1.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private double precioTotal;
    private double pesoTotal;
    private List<Producto> productos;

    public Balanza(){
        productos = new ArrayList<>();
        precioTotal = 0;
        pesoTotal = 0;
    }

    public void ponerEnCero(){
        productos.clear();
        precioTotal = 0;
        pesoTotal = 0;
    }
    public void agregarProducto(Producto p){
        precioTotal+= p.getPrecio();
        pesoTotal+= p.getPeso();
        productos.add(p);
    }
    public Ticket emitirTicket(){
        return new Ticket(this.getCantidadDeProductos(),pesoTotal,precioTotal);
    }
    public int getCantidadDeProductos(){
        return productos.size();
    }
    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
