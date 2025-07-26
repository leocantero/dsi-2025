package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IObserver;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

public class ContadorDeVentas implements IObserver{
    private Integer contador;

    @Override
    public void serNotificado(Producto producto) {
        this.contabilizarVenta(producto);
    }

    public void contabilizarVenta(Producto producto){
        this.contador += 1;
    }
}
