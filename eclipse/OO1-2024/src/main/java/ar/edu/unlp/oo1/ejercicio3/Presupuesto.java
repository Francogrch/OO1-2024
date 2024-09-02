package ar.edu.unlp.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha;
    private String cliente;
    private List<Item> items;

    public Presupuesto(LocalDate fecha, String cliente) {
        items = new ArrayList<Item>();
        this.fecha = fecha;
        this.cliente = cliente;
    }
    public void agregarItem(Item i){
       items.add(i) ;
    }
    public double calcularTotal(){
        return items.stream().mapToDouble(item -> item.costo()).sum();
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
