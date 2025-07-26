package ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.impl;

import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IAdapterAPI;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.observers.IObserver;
import ar.edu.utn.frba.dds.garbarisi.garbarisi.models.entities.productos.Producto;

public class OficinaContable implements IObserver {
    private IAdapterAPI adapterAPI;

    @Override
    public void serNotificado(Producto producto) {
        this.adapterAPI.registrarVentaSistemaExterno(producto);
    }

}
