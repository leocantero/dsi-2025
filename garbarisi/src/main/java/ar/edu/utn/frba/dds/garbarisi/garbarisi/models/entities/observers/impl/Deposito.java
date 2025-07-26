package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IObserver;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

public class Deposito implements IObserver {

    @Override
    public void serNotificado(Producto producto) {
        this.prepararVenta(producto);
    }

    public void prepararVenta(Producto producto) {
        System.out.println("Preparando producto " + producto.getNombre() + " para la venta.");
    }
}
